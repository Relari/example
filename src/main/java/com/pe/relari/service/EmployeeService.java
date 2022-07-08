package com.pe.relari.service;

import com.pe.relari.model.domain.Employee;

import java.util.List;

/**
 * Interface EmployeeService.
 * @author Relari
 */
public interface EmployeeService {

  List<Employee> findAll();

  void save(Employee employee);

}
