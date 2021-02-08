package com.renzo.exercises.lessons.java.retrofit;

import com.renzo.exercises.lessons.java.model.Employee;

import java.io.IOException;
import java.util.List;

interface EmployeeDao {

  List<Employee> findAll() throws IOException;

}
