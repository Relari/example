package com.pe.relari.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Class DatabaseConfig.
 * @author Relari
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DatabaseConfig {

    private static final DatabaseProperty dbProperty = new DatabaseProperty();
    private static DatabaseConfig instance;

    public static DatabaseConfig getInstance() {
        if(instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

//    private boolean loadDriver() {
//        try {
//            Class.forName(DatabaseProperty.DRIVER_NAME);
//            return true;
//        } catch (ClassNotFoundException e) {
//            System.err.println("Error al cargar el driver " + e.getMessage());
//            return false;
//        }
//    }

    public Connection getConnection() {
//        if (!loadDriver()) {
//            return null;
//        }

        try {
            return DriverManager.getConnection(
                    dbProperty.getUrl().concat(dbProperty.getDatabase()),
                    dbProperty.getUsername(),
                    dbProperty.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void closeConnection() {
        try {
            Objects.requireNonNull(getConnection()).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}