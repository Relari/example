package com.pe.relari.people.service.impl;



import com.pe.relari.people.dao.impl.EmployeeRepositoryImpl;
import com.pe.relari.people.dao.repository.EmployeeRepository;
import com.pe.relari.people.model.domain.Employee;
import com.pe.relari.people.service.EmployeeService;

import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Class EmployeeServiceImpl.
 * @author Relari
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeServiceImpl implements EmployeeService {

  private static EmployeeServiceImpl employeeServiceImpl;
    
  public static EmployeeService getInstance() {
    if (employeeServiceImpl == null) {
        employeeServiceImpl = new EmployeeServiceImpl();
    }
    return employeeServiceImpl;
  }
  
  private final EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

  @Override
  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }

  @Override
  public void save(Employee employee) {
    
    employeeRepository.save(employee);

  }

}
