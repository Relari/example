/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.relari.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author cld_r
 */

public class DatabaseProperty {

  private static final String RESOURCES_DIRECTORY = System.getProperty("user.dir")
          .concat("\\src\\main\\resources\\");
  private static final Properties prop = new Properties();

  public DatabaseProperty() {
    getProperties();
  }

  private void getProperties() {

    try (InputStream is = new FileInputStream(
            RESOURCES_DIRECTORY.concat("application.properties"))) {
      prop.load(is);
    } catch(IOException ioe) {
      ioe.printStackTrace();
    }
  }

  public String getUsername() {
    return prop.getProperty("db.username");
  }

  public String getPassword() {
    return prop.getProperty("db.password");
  }

  public String getUrl() {
    return prop.getProperty("db.url");
  }

  public String getDatabase() {
    return prop.getProperty("db.database");
  }
}
