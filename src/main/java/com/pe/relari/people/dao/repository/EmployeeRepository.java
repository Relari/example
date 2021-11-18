package com.pe.relari.people.dao.repository;

import com.pe.relari.people.model.domain.Employee;

import java.util.List;

/**
 * Interface EmployeeRepository.
 * @author Relari
 */
public interface EmployeeRepository {

    void save(Employee employee);

    void update(Employee employee);

    void deleteById(int employeeId);

    Employee findById(int employeeId);

    List<Employee> findAll();

    List<Employee> findByStatus(boolean status);
}
