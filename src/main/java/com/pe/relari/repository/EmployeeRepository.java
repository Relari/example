package com.pe.relari.repository;

import com.pe.relari.model.Employee;

import java.util.List;

/**
 * Interface EmployeeRepository.
 * @author Relari
 */
public interface EmployeeRepository {

    boolean save(Employee employee);

//    void update(EmployeeEntity employee);

    boolean updatedStatusById(int employeeId, boolean status);

    Employee findById(int employeeId);

    List<Employee> findAll();

    List<Employee> findByStatus(boolean status);
}
