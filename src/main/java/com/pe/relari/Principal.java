package com.pe.relari;

import com.pe.relari.model.Employee;
import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.repository.impl.EmployeeRepositoryImpl;
import com.pe.relari.service.EmployeeService;
import com.pe.relari.service.impl.EmployeeServiceImpl;

public class Principal {

    public static void main(String[] args) {

        EmployeeService employeeService = EmployeeServiceImpl.getInstance();
        System.out.println(employeeService.findById(100));

        System.out.println("\n");

        EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
        employeeRepository.findAll()
                .forEach(System.out::println);

        System.out.println("\n");

        Employee employee = employeeRepository.findById(101);

        System.out.println(employee);


        System.out.println("\n");

//        employeeRepository.deleteById(1);

        employeeRepository.findByStatus(true)
                .forEach(System.out::println);

    }

}
