package com.richard.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {

  private Long id;

  @NonNull
  private Long organizationId;

  @NonNull
  private Long departmentId;

  @NonNull
  private String name;

  @NonNull
  private Integer age;

  @NonNull
  private String position;

}
