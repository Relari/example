package com.renzo.exercises.lessons.java.retrofit;

import com.renzo.exercises.lessons.java.model.Employee;
import lombok.extern.java.Log;

import java.io.IOException;
import java.util.List;

@Log
class EmployeeDaoImpl implements EmployeeDao {

  private final RestConfiguration configuration = new RestConfiguration();

  @Override
  public List<Employee> findAll() throws IOException {
    return configuration.employeeRepository()
            .findAll()
            .execute()
            .body();
  }

  public static void main(String[] args) throws IOException {

    EmployeeDao employeeDao = new EmployeeDaoImpl();
    employeeDao.findAll()
            .forEach(employeeEntity -> log.info(employeeEntity.toString()));

  }

}
