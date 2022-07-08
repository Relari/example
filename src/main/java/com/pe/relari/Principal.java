package com.pe.relari;

import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.repository.impl.EmployeeRepositoryImpl;

public class Principal {

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        employeeRepository.findAll()
                .forEach(System.out::println);

        System.out.println("\n");

        System.out.println(employeeRepository.findById(1));

        System.out.println("\n");

//        employeeRepository.deleteById(1);

        employeeRepository.findByStatus(true)
                .forEach(System.out::println);

    }

}
