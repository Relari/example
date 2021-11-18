package com.pe.relari.people.model.domain;

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

  private String id;
  private String name;
  private String sex;
  private String position;
  private Integer salary;
  private Boolean status;

  public EmployeeBuilder mutate() {
    return Employee.builder()
            .id(id)
            .name(name)
            .sex(sex)
            .position(position)
            .salary(salary)
            .status(status);
  }

}
