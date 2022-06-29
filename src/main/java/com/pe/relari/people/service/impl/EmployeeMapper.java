package com.pe.relari.people.service.impl;

import com.pe.relari.people.model.domain.Employee;
import com.pe.relari.people.model.entity.EmployeeEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Class EmployeeMapper.
 * @author Relari
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeMapper {

  public static Employee mapEmployee(EmployeeEntity employeeEntity) {
    return Employee.builder()
            .id(employeeEntity.getId())
            .name(employeeEntity.getName())
            .position(employeeEntity.getPosition())
            .salary(employeeEntity.getSalary())
            .sex(employeeEntity.getSex())
            .status(employeeEntity.getStatus())
            .build();
  }

  public static EmployeeEntity mapEmployeeEntity(Employee employee) {
    return EmployeeEntity.builder()
            .id(employee.getId())
            .name(employee.getName())
            .position(employee.getPosition())
            .salary(employee.getSalary())
            .sex(employee.getSex())
            .status(employee.getStatus())
            .build();
  }

}