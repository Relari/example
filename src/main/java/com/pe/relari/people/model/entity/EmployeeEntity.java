package com.pe.relari.people.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class EmployeeEntity.
 * @author Relari
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

  private String id;
  private String name;
  private String sex;
  private String position;
  private Integer salary;
  private Boolean status;

}
