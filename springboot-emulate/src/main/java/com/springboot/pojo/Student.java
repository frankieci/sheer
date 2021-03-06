package com.springboot.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Student implements Serializable {

  private static final long serialVersionUID = -6849794470754667710L;

  private Integer id;

  private String name;

  private Integer age;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}