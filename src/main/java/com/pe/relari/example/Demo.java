package com.pe.relari.example;

import lombok.extern.java.Log;

import java.util.Scanner;

@Log
public class Demo {

    private static final String APROBADO_VALUE = "APROBADO";
    private static final String DESAPROBADO_VALUE = "DESAPROBADO";

    public static int sumar1(int number1, int number2) {
        int resultado = 0;
        resultado = number1 + number2;
        return resultado;
    }

    public static int sumar2(int number1, int number2) {
        return number1 + number2;
    }

    public static String mostrarResultado1(int number) {
        String resultado = "";
        if (number > 10) {
            resultado = APROBADO_VALUE;
        } else {
            resultado = DESAPROBADO_VALUE;
        }
        return resultado;
    }

    public static String mostrarResultado2(int number) {
        if (number > 10) {
            return APROBADO_VALUE;
        } else {
            return DESAPROBADO_VALUE;
        }
    }

    public static String mostrarResultado3(int number) {
        return (number > 10) ? APROBADO_VALUE : DESAPROBADO_VALUE;
    }

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        log.info("Ingrese Nota: ");
        int number = scanner.nextInt();
        scanner.close();

        String message = (number > 10) ? APROBADO_VALUE : DESAPROBADO_VALUE;
        log.info(message);
    }
}
