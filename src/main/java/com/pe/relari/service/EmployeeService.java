package com.pe.relari.service;

import com.pe.relari.model.Employee;

import java.util.List;

/**
 * Interface EmployeeService.
 * Clase donde se define los metodos que va a tener la logica de negocio.
 * @author Relari
 */
public interface EmployeeService {

  List<Employee> findAll();

  Employee findById(int employeeId);

  void save(Employee employee);

}
