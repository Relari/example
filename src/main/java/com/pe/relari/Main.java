package com.pe.relari;

import com.pe.relari.config.DatabaseConfig;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection conn = DatabaseConfig.getInstance().getConnection();

        if (conn == null) {
            System.out.println("La conexion es nula.");
        } else {
            System.out.println("La conexion existe.");
        }

    }
}