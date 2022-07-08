package com.pe.relari.service.impl;

import com.pe.relari.model.domain.Employee;
import com.pe.relari.model.entity.EmployeeEntity;
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
            .fatherLastName(employeeEntity.getFatherLastName())
            .motherLastName(employeeEntity.getMotherLastName())
            .firstName(employeeEntity.getFirstName())
            .position(employeeEntity.getPosition())
            .salary(employeeEntity.getSalary())
            .sex(employeeEntity.getSex())
            .isActive(employeeEntity.getIsActive())
            .build();
  }

  public static EmployeeEntity mapEmployeeEntity(Employee employee) {
    return EmployeeEntity.builder()
            .id(employee.getId())
            .fatherLastName(employee.getFatherLastName())
            .motherLastName(employee.getMotherLastName())
            .firstName(employee.getFirstName())
            .position(employee.getPosition())
            .salary(employee.getSalary())
            .sex(employee.getSex())
            .isActive(employee.getIsActive())
            .build();
  }

}