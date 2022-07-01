package com.pe.relari.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Class DatabaseConfig.
 * @author Relari
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DatabaseConfig {

    private static DatabaseConfig instance;

    public static DatabaseConfig getInstance() {
        if(instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    private boolean loadDriver() {
        try {
            Class.forName(DatabaseProperty.DRIVER_NAME);
            return true;
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el driver " + e.getMessage());
            return false;
        }
    }

    public Connection getConnection() {
        if (!loadDriver()) {
            return null;
        }

        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/db_demo",
                    DatabaseProperty.USERNAME,
                    DatabaseProperty.PASSWORD
            );
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos " + e.getMessage());
            return null;
        }
    }

    public void closeConnection() {
        try {
            getConnection().close();
            System.out.println("Se desconecto la base de datos");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}