package com.springboot.service;

import com.springboot.pojo.Student;

import java.util.List;

public interface StudentService {
  public List<Student> getAllStudent();

  public int updateStudent();
}
