package org.example;

import org.example.database.DatabaseService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Connection connection = DatabaseService.createConnection();

        try {
            obrisiRacun(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void obrisiRacun(Connection connection) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        connection.setAutoCommit(false);

        System.out.println("Odaberite IDRacun koji želite obrisati");

        int idRacun = scanner.nextInt();

        System.out.println("Odabrali ste idRacuna " + idRacun);
        try {
            String deleteQuery = "DELETE FROM Stavka WHERE RacunID = ?";
            PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery);
            deleteStmt.setInt(1, idRacun);
            deleteStmt.executeUpdate();

            String deleteQueryRacun = "DELETE FROM Racun WHERE IDRacun = ?";
            PreparedStatement deleteStmtRacun = connection.prepareStatement(deleteQueryRacun);
            deleteStmtRacun.setInt(1, idRacun);
            deleteStmtRacun.executeUpdate();

            String selectQuery = "SELECT * FROM Stavka WHERE RacunID = ?";
            PreparedStatement selectStmt = connection.prepareStatement(selectQuery);
            selectStmt.setInt(1, idRacun);
            ResultSet resultSet = selectStmt.executeQuery();

            if (!resultSet.next()) {
                System.out.println("Nema stavke s tim računom");
            } else {
                while (resultSet.next()) {
                    int idStavka = resultSet.getInt("idStavka");
                    System.out.println("idStavka: " + idStavka);
                }
            }

            deleteStmt.close();
            selectStmt.close();

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            connection.rollback();
        }
    }
}
