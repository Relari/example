package com.pe.relari.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * Class DatabaseConfig.
 * @author Relari
 */

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DatabaseConfig {

    private static final DatabaseProperty dbProperty = new DatabaseProperty();
    private static DatabaseConfig instance;

    public static DatabaseConfig getInstance() {
        if(instance == null) {
            log.debug("Creando nueva instancia para la base de datos");
            instance = new DatabaseConfig();
        }
        log.debug("Retornar instancia existente");
        return instance;
    }

    public Connection getConnection() {
        try {
            log.debug("Conectando a la base de datos.");
            return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/db_demo",
                "postgres",
                "123456"
        );
            // return DriverManager.getConnection(
            //         dbProperty.getUrl().concat(dbProperty.getDatabase()),
            //         dbProperty.getUsername(),
            //         dbProperty.getPassword()
            // );
        } catch (SQLException e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    public void closeConnection() {
        try {
            log.debug("Cerrando la coneccion a la base de datos.");
            Objects.requireNonNull(getConnection()).close();
        } catch (SQLException e) {
            log.error(e.getMessage(), e);
        }
    }
}