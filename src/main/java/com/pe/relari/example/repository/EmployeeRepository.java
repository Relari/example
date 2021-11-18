package com.pe.relari.example.repository;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import com.pe.relari.example.model.Employee;
import org.springframework.core.io.ClassPathResource;

public class EmployeeRepository {

  public static List<Employee> employees() throws IOException {
    File resource = new ClassPathResource("employees.json").getFile();

    String employeesJson = new String(Files.readAllBytes(resource.toPath()));

    Gson gson = new Gson();

    Employee[] employees = gson.fromJson(employeesJson, Employee[].class);

    return Arrays.asList(employees);
  }

  public static void main(String[] args) throws IOException {
    employees().forEach(System.out::println);
  }

}
