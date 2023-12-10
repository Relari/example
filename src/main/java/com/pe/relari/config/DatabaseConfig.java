package com.pe.relari.config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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

    private static DatabaseConfig instance;

    private Connection connection;

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

            connection = DriverManager.getConnection(ApplicationProperties.DB_URL);

//            return DriverManager.getConnection(
//                ApplicationProperties.DB_URL,
//                ApplicationProperties.DB_USERNAME,
//                ApplicationProperties.DB_PASSWORD
//            );

            return connection;

        } catch (SQLException e) {
            log.error(e.getMessage(), e);
            return null;
        } finally {
            // Leer el contenido del archivo SQL
            StringBuilder script = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(ApplicationProperties.SCRIPT))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    script.append(line).append("\n");
                }

                Statement statement = connection.createStatement();
                statement.executeUpdate(script.toString());

            } catch (IOException | SQLException e) {
                e.printStackTrace();
            }
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