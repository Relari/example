package com.pe.relari.people.service.impl;


import com.pe.relari.people.dao.impl.EmployeeRepositoryImpl;
import com.pe.relari.people.dao.repository.EmployeeRepository;
import com.pe.relari.people.model.domain.Employee;
import com.pe.relari.people.service.EmployeeService;
import java.util.List;

/**
 * Class EmployeeServiceImpl.
 * @author Relari
 */

public class EmployeeServiceImpl implements EmployeeService {

  private static EmployeeService employeeService;

  private final EmployeeRepository employeeRepository;

  private EmployeeServiceImpl() {
    this.employeeRepository = new EmployeeRepositoryImpl();
  }

  public static EmployeeService getInstance() {
    if (employeeService == null) {
      employeeService = new EmployeeServiceImpl();
    }
    return employeeService;
  }

  @Override
  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }

  @Override
  public void save(Employee employee) {
    employeeRepository.save(employee);
  }

}
