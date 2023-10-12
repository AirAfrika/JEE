package com.AirAfrika.DBCnx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Cnx {
	private static DatabaseConnection instance = null;
    private Connection connection = null;

    private static final String URL = "jdbc:postgresql://localhost:5432/votre_base_de_donnees";
    private static final String UTILISATEUR = "";
    private static final String MOT_DE_PASSE = "1234";

    private DatabaseConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, UTILISATEUR, MOT_DE_PASSE);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erreur lors de la création de la connexion à la base de données.");
        }
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
