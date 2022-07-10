package com.pe.relari.service.impl;

import com.pe.relari.model.Employee;
import com.pe.relari.repository.impl.EmployeeRepositoryImpl;
import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.service.EmployeeService;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

import java.util.List;
import java.util.Objects;

/**
 * Class EmployeeServiceImpl.
 * Clase donde se va a realizar la logica de negocio implementando los objetos de la interfaz
 * @author Relari
 */

@Log4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeServiceImpl implements EmployeeService {

  private static EmployeeService employeeService;

  private static final EmployeeRepository employeeRepository =
          EmployeeRepositoryImpl.getInstance();

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
  public Employee findById(int employeeId) {
    Employee employee = employeeRepository.findById(employeeId);
    if (Objects.isNull(employee)) {
      log.error("No se encontro al empleado con el id=" + employeeId);
      return new Employee();
    } else {
      log.debug("Se encontro al empleado del id=" + employeeId);
    }
    return employee;
  }

  @Override
  public void save(Employee employee) {
    employeeRepository.save(employee);
  }

}
