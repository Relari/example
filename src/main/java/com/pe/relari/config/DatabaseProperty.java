/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.relari.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 *
 * @author cld_r
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class DatabaseProperty {
    
  static final String DRIVER_NAME = "org.postgresql.Driver";
  private static final String HOSTNAME = "localhost";
  static final String USERNAME = "postgres";
  static final String PASSWORD = "";
  private static final String DATABASE = "EMPLOYEE";

  public static String getUriConnection() {
      return "jdbc:postgresql://".concat(HOSTNAME).concat("/").concat(DATABASE);
  }
}
