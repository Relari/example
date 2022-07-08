package com.pe.relari.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class Employee.
 * @author Relari
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

  private Integer id;
  private String fatherLastName;
  private String motherLastName;
  private String firstName;
  private String position;
  private String sex;
  private Double salary;
  private Boolean isActive;

  public EmployeeBuilder mutate() {
    return Employee.builder()
            .id(id)
            .fatherLastName(fatherLastName)
            .motherLastName(motherLastName)
            .firstName(firstName)
            .sex(sex)
            .position(position)
            .salary(salary)
            .isActive(isActive);
  }

}
