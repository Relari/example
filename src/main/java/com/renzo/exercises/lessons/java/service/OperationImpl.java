package com.renzo.exercises.lessons.java.service;

public class OperationImpl {

    public static void main(String[] args) {

        OperationInterface operationInterface = (a, b) -> a + b;

        System.out.println(operationInterface.sumOfTwoValues(1, 2));
        System.out.println(operationInterface.message("Renzo"));
        System.out.println(operationInterface.messageDefault());

    }
}
