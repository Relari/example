package com.pe.relari.people.dao.repository;

import com.pe.relari.people.model.entity.EmployeeEntity;

import java.util.List;

/**
 * Interface EmployeeRepository.
 * @author Relari
 */
public interface EmployeeRepository {

    void save(EmployeeEntity employee);

//    void update(EmployeeEntity employee);
//
//    void deleteById(int employeeId);
//
//    EmployeeEntity findById(int employeeId);

    List<EmployeeEntity> findAll();

//    List<EmployeeEntity> findByStatus(boolean status);
}
