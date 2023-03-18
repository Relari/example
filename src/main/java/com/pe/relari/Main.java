package com.pe.relari;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        int numero = 100;
//        String texto = "Hello World";
//        boolean estado = false;
//        double decimal = 9.99;

//        if (/*Condicion*/ estado) { // Resultado va verdadero o falso (true and false)
//            // Si la condicion es verdadera
//            System.out.println("El estado es verdadero");
//        } else {
//            // Si la condicion es falsa
//            System.err.println("El estado es falso");
//        }

//        if (numero > 200) {
//            System.out.println("EL numero es mayor que 200");
//        } else if (numero > 100) {
//            System.out.println("El numero es mayor que 100");
//        } else {
//            System.err.println("El numero es menor que 100");
//        }

//        switch (numero) {
//            case 100:
//                System.out.println("Escogiste la opcion 100");
//                break;
//            case 200:
//                System.out.println("Escogiste la opcion 200");
//                break;
//            default:
//                System.out.println("Opcion Invalida");
//                break;
//        }
//
//        System.out.println(numero > 100);

        List<String> names = new ArrayList<>(); // Trae una lista de valores.
//        Set<String> names = new HashSet<>(); // Trae una lista de valores quitando duplicados.
        names.add("Renzo");
        names.add("Cristopher");
        names.add("Karen");
        names.add("Mercedes");
        names.add("Karen");

        System.out.println(names);

//        for (int i = 0; i < names.size(); i++) {
//            if (!names.get(i).equals("Mercedes")) {
//                System.out.println(names.get(i));
//            }
//        }

//        for (String name : names) {
//            if (name.equals("Daniel") || name.equals("Maria")) {
//                System.out.println(name);
//            }
//        }

        List<String> namesInvalids = new ArrayList<>();
        namesInvalids.add("Renzo");
        namesInvalids.add("Karen");

//        for (String name : names) {
//            if (!namesInvalids.contains(name)) {
//                System.out.println(name);
//            }
//        }

        Map<Integer, List<String>> registro = new HashMap<>();
        registro.put(1, names);
        registro.put(2, namesInvalids);

        System.out.println(registro.get(1));

    }
}