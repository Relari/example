package com.pe.relari;

import com.pe.relari.people.repository.EmployeeRepository;
import com.pe.relari.people.repository.impl.EmployeeRepositoryImpl;

public class Principal {

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        employeeRepository.findAll().forEach(System.out::println);

    }

}
