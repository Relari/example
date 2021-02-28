package com.renzo.exercises.lessons.java.service;

import com.renzo.exercises.lessons.java.model.Employee;
import com.renzo.exercises.lessons.java.repository.EmployeeRepository;

import java.util.List;

public class ForEach {

    private final List<Employee> employees = EmployeeRepository.employees();

    static void separation() {
        System.out.println("\n--------------------------------------\n");
    }

    public void foreachJava7FirstShape() {
        System.out.println("Foreach en Java 7");

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }

    }

    public void foreachJava7SecondShape() {
        System.out.println("Foreach en Java 7");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public void foreachJava8() {
        System.out.println("Foreach en Java 8");
        employees.forEach(employee -> System.out.println(employee));
    }

    public void foreachJava8Reduced() {
        System.out.println("Foreach reduced en Java 8");
        employees.forEach(System.out::println);
    }

    public static void main(String[] args) {

        ForEach forEach = new ForEach();

        forEach.foreachJava7FirstShape();
        separation();

        forEach.foreachJava7SecondShape();
        separation();

        forEach.foreachJava8();
        separation();

        forEach.foreachJava8Reduced();
        separation();

    }
}
