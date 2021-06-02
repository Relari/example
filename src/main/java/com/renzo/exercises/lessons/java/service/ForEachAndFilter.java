package com.renzo.exercises.lessons.java.service;

import com.renzo.exercises.lessons.java.model.Employee;
import com.renzo.exercises.lessons.java.repository.EmployeeRepository;

import java.util.List;

public class ForEachAndFilter {

    private final List<Employee> employees = EmployeeRepository.employees();

    static void separation() {
        System.out.println("\n--------------------------------------\n");
    }

    public void foreachAndIfInJava7FirstShape() {
        System.out.println("Foreach + Conditional en Java 7");

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getActive()) {
                System.out.println(employees.get(i));
            }
        }
    }

    public void foreachAndIfInJava7SecondShape() {
        System.out.println("Foreach + Conditional en Java 7");
        for (Employee employee : employees) {
            if (employee.getActive()) {
                System.out.println(employee);
            }
        }
    }

    public void foreachAndFilterJava8() {
        System.out.println("Foreach utilized stream en Java 8");
        employees.stream()
                .filter(employee -> employee.getActive())
                .forEach(employee -> System.out.println(employee));
    }

    public void foreachAndFilterJava8Reduced() {
        System.out.println("Foreach utilized stream reduced en Java 8");
        employees.stream()
                .filter(Employee::getActive)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        ForEachAndFilter forEachAndFilter = new ForEachAndFilter();

        forEachAndFilter.foreachAndIfInJava7FirstShape();
        separation();

        forEachAndFilter.foreachAndIfInJava7SecondShape();
        separation();

        forEachAndFilter.foreachAndFilterJava8();
        separation();

        forEachAndFilter.foreachAndFilterJava8Reduced();
        separation();

    }
}
