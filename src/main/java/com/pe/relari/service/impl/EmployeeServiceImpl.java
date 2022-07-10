package com.pe.relari.service.impl;

import static com.pe.relari.util.EmployeeUtil.EMPTY;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

import com.pe.relari.model.Employee;
import com.pe.relari.repository.impl.EmployeeRepositoryImpl;
import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.service.EmployeeService;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Objects;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

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
      JOptionPane.showMessageDialog(null, "Empleado no encontrado", EMPTY, ERROR_MESSAGE);
      return new Employee();
    } else {
      log.debug("Se encontro al empleado del id=" + employeeId);
    }
    return employee;
  }

  @Override
  public void save(Employee employee) {
    boolean result = employeeRepository.save(employee);
    if (result) {
      log.info("Se registro correctamente al empleado.");
      JOptionPane.showMessageDialog(null, "Empleado registrado");
    } else  {
      log.error("No se registro al empleado.");
      JOptionPane.showMessageDialog(null, "Empleado no registrado", EMPTY, ERROR_MESSAGE);
    }
  }

}
