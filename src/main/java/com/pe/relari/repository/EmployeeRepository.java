package com.pe.relari.repository;

import com.pe.relari.model.Employee;

import java.util.List;
import java.util.Optional;

/**
 * Interface EmployeeRepository.
 * @author Relari
 */
public interface EmployeeRepository {

    void save(Employee employee);

//    void update(EmployeeEntity employee);

    void deleteById(int employeeId);

    Employee findById(int employeeId);

    List<Employee> findAll();

    List<Employee> findByStatus(boolean status);
}
