package com.pe.relari.people.dao.impl;

import static com.pe.relari.config.RestConfiguration.employeeApi;

import com.pe.relari.people.dao.EmployeeDao;
import com.pe.relari.people.model.domain.Employee;
import com.pe.relari.people.service.EmployeeService;
import com.pe.relari.people.service.impl.EmployeeServiceImpl;
import lombok.extern.java.Log;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Class EmployeeDaoImpl.
 * @author Relari
 */
@Log
public class EmployeeDaoImpl implements EmployeeDao {

  private static EmployeeDaoImpl employeeDao;

  public static EmployeeDao getInstance() {
    if (employeeDao == null) {
      employeeDao = new EmployeeDaoImpl();
    }
    return employeeDao;
  }

  @Override
  public List<Employee> findAll() throws IOException {
    return Objects.requireNonNull(employeeApi()
            .findAll()
            .execute()
            .body())
            .stream()
            .map(EmployeeMapper::mapEmployee)
            .collect(Collectors.toList());
  }

  @Override
  public boolean save(Employee employee) throws IOException {
    return employeeApi()
            .save(EmployeeMapper.mapEmployeeEntity(employee))
            .execute()
            .isSuccessful();
  }

}
