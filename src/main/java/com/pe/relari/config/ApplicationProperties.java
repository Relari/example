package com.pe.relari.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author Relari
 */

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApplicationProperties {

    public static final String RESOURCES_DIRECTORY = System.getProperty("user.dir")
            .concat("\\src\\main\\resources\\application.properties");

    public static final String DB_USERNAME = DatabaseProperty.getProperty("db.username");

    public static final String DB_PASSWORD = DatabaseProperty.getProperty("db.password");

    public static final String DB_URL = DatabaseProperty.getProperty("db.url");

    public static final String DB_DATABASE = DatabaseProperty.getProperty("db.database");

}
