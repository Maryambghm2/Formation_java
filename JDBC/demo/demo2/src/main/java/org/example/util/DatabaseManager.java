package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    // Preparation pour se connecter à ma BDD
    // url = jdbc:nom_dbconnecteur:localisation_bdd::nbPort/nom_db:
    private final String url = "jdbc:mysql://localhost:3306/demo_jdbc";
    private final String username = "root";
    private final String password = "test";

    public Connection getConnection() throws SQLException {


        return DriverManager.getConnection(url, username, password);
    }

}
