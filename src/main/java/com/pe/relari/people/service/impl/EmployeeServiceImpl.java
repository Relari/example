package com.pe.relari.people.service.impl;

import com.pe.relari.people.dao.impl.EmployeeRepositoryImpl;
import com.pe.relari.people.dao.repository.EmployeeRepository;
import com.pe.relari.people.model.domain.Employee;
import com.pe.relari.people.service.EmployeeService;
import java.util.List;
import java.util.stream.Collectors;

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
    return employeeRepository.findAll()
            .stream()
            .map(EmployeeMapper::mapEmployee)
            .collect(Collectors.toList());
  }

  @Override
  public void save(Employee employee) {
    var employeeEntity = EmployeeMapper.mapEmployeeEntity(employee);
    employeeRepository.save(employeeEntity);
  }

}
