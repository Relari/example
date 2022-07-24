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
import lombok.extern.log4j.Log4j2;

/**
 * Class EmployeeServiceImpl.
 * Clase donde se va a realizar la logica de negocio implementando los objetos de la interfaz
 * @author Relari
 */

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeServiceImpl implements EmployeeService {

  private static EmployeeService employeeService;

  private static final EmployeeRepository employeeRepository =
          EmployeeRepositoryImpl.getInstance();

  public static EmployeeService getInstance() {
    if (employeeService == null) {
        log.info("Creando instancia");
      employeeService = new EmployeeServiceImpl();
    }
    log.info("Instancia activa");
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

  @Override
  public void deleteById(int employeeId) {
      
    Employee employee = findById(employeeId);
    if (Boolean.FALSE.equals(employee.getIsActive())) {
        log.info("El empleado esta eliminado.");
        JOptionPane.showMessageDialog(null, "Empleado ya fue eliminado");
    } else {
        boolean result = employeeRepository.updatedStatusById(employeeId, false);
        if (result) {
          log.info("Se elimino correctamente al empleado.");
          JOptionPane.showMessageDialog(null, "Empleado eliminado");
        } else  {
          log.error("No se elimino al empleado.");
          JOptionPane.showMessageDialog(null, "Empleado no eliminado", EMPTY, ERROR_MESSAGE);
        }
    }
  }

    @Override
    public void activeById(int employeeId) {
        Employee employee = findById(employeeId);
        if (Boolean.TRUE.equals(employee.getIsActive())) {
            log.info("El empleado esta activado.");
            JOptionPane.showMessageDialog(null, "Empleado ya fue activado");
        } else {
            boolean result = employeeRepository.updatedStatusById(employeeId, true);
            if (result) {
              log.info("Se activo correctamente al empleado.");
              JOptionPane.showMessageDialog(null, "Empleado activado");
            } else  {
              log.error("No se activo al empleado.");
              JOptionPane.showMessageDialog(null, "Empleado no activado", EMPTY, ERROR_MESSAGE);
            }
        }
    }

    @Override
    public List<Employee> findByStatus(boolean status) {
        return employeeRepository.findByStatus(status);
    }

}
