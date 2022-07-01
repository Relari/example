package com.pe.relari;

import com.pe.relari.people.dao.impl.EmployeeRepositoryImpl;
import com.pe.relari.people.dao.repository.EmployeeRepository;

public class Principal {

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        employeeRepository.findAll().forEach(System.out::println);

    }

}
