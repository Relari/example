package com.renzo.exercises.lessons.java.service;

import com.renzo.exercises.lessons.java.model.Employee;
import com.renzo.exercises.lessons.java.model.Person;
import com.renzo.exercises.lessons.java.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachAndMap {

    private final List<Employee> employees = EmployeeRepository.employees();

    static void separation() {
        System.out.println("\n--------------------------------------\n");
    }

    public void foreachConvertJava7(){
        System.out.println("Foreach en Java 7");

        List<Person> people = new ArrayList<>();


        for (Employee employee : employees) {
            people.add(new Person(employee.getId(), employee.getName()));

            System.out.println(employee);
        }

        separation();

        for (Person person: people) {
            System.out.println(person);
        }
    }

    public void foreachWithStreamAndMap() {

        List<Person> people = employees.stream()
                .map(employee -> {
                    Person person = new Person(employee.getId(), employee.getName());
                    return person;
                }).collect(Collectors.toList());

        people.forEach(System.out::println);
    }

    public void foreachWithStreamAndMapWithBuilder() {
        List<Person> people = employees.stream()
                .map(employee -> new Person(employee.getId(), employee.getName()))
                .collect(Collectors.toList());

        people.forEach(System.out::println);
    }

    public void foreachWithStreamAndMapWithMethod() {
        List<Person> people = employees.stream()
                .map(this::mapPerson)
                .collect(Collectors.toList());

        people.forEach(System.out::println);
    }

    private Person mapPerson(Employee employee) {
        return new Person(employee.getId(), employee.getName());
    }

    public static void main(String[] args) {

        ForEachAndMap forEachAndMap = new ForEachAndMap();

        forEachAndMap.foreachConvertJava7();
        separation();

        forEachAndMap.foreachWithStreamAndMap();
        separation();

        forEachAndMap.foreachWithStreamAndMapWithBuilder();
        separation();

        forEachAndMap.foreachWithStreamAndMapWithMethod();
        separation();

    }

}
