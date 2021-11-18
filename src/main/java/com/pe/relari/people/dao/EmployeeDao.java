package com.pe.relari.people.dao;


import com.pe.relari.people.model.domain.Employee;

import java.io.IOException;
import java.util.List;

/**
 * Interface EmployeeDao.
 * @author Relari
 */
public interface EmployeeDao {

  List<Employee> findAll() throws IOException;

  boolean save(Employee employee) throws IOException;

}
