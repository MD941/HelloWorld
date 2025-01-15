package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {

    public static Connection createConnection() {

        String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=AdventureWorksOBP;encrypt=true;trustServerCertificate=true";
        String user = "root";
        String password = "password";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.err.println("Pogreška pri povezivanju s bazom: " + e.getMessage());
            throw new RuntimeException(e);
        }

        return connection;
    }
}
