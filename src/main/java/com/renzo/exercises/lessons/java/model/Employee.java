package com.renzo.exercises.lessons.java.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

  private Integer id;
  private String name;
  private Integer age;
  private Gender sex;
  private String position;
  private Integer salary;
  private Boolean active;

}
