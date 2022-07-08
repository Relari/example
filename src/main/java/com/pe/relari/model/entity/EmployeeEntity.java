package com.pe.relari.model.entity;

import java.io.Serializable;

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
public class EmployeeEntity implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -417558511178657636L;

  private Integer id;
  private String fatherLastName;
  private String motherLastName;
  private String firstName;
  private String position;
  private String sex;
  private Double salary;
  private Boolean isActive;

}
