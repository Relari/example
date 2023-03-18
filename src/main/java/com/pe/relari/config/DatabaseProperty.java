package com.pe.relari.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 *
 * @author Relari
 */

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DatabaseProperty {

  private static final Properties prop = new Properties();

  public static String getProperty(String param) {

    String response = null;
    try (InputStream is = new FileInputStream(ApplicationProperties.RESOURCES_DIRECTORY)) {
      prop.load(is);
      response = prop.getProperty(param);
    } catch(IOException ioe) {
        log.error(ioe.getMessage(), ioe);
    }
    return response;
  }

}
