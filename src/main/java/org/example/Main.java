package org.example;

import org.example.database.DatabaseService;

import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(
                "1 - novi grad" +
                        "\n" + "2 - izmjena postojećeg grada " +
                        "\n" + "3 - brisanje postojećeg grada" +
                        "\n" + "4 - prikaz svih sortiranih po nazivu" +
                        "\n" + "5 - kraj");

        Connection connection = DatabaseService.createConnection();

        try {
            odaberiOpciju();
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

    private static void insertGrad(String imeGrada) {
        Connection connection = DatabaseService.createConnection();

        try {
            String query = "INSERT INTO GRAD (Naziv, DrzavaID) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, imeGrada);
            statement.setInt(2, 1);

            statement.executeUpdate();

            statement.close();
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

    private static void updateGrad(int idGrada, String imeGrada) {
        Connection connection = DatabaseService.createConnection();

        try {
            String query = "UPDATE GRAD SET Naziv = ? WHERE IDGrad = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(2, idGrada);
            statement.setString(1, imeGrada);

            statement.executeUpdate();

            statement.close();
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


    public static void odaberiOpciju() {
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Upišite ime grada");
                    String imeGrada = scanner.nextLine();
                    insertGrad(imeGrada);
                    break;
                case 2:
                    System.out.println("Unesite ID grada kojeg želite izmjeniti, te novi naziv grada");

                    System.out.println("ID grada: ");
                    int idGrada = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("Naziv grada: ");
                    String novoImeGrada = scanner.nextLine();

                    updateGrad(idGrada, novoImeGrada);
                    break;

                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
            }

        } while (option != 5);
        scanner.close();
    }
}