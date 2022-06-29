package com.pe.relari.people.service;

import com.pe.relari.people.model.domain.Employee;
import com.pe.relari.people.service.impl.EmployeeServiceImpl;

import java.util.List;

/**
 * Interface EmployeeService.
 * @author Relari
 */
public interface EmployeeService {

  List<Employee> findAll();

  void save(Employee employee);

}
