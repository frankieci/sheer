package com.springboot.controller;

import com.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class MybatisController {

  @Autowired
  private StudentService studentService;

  @GetMapping("/boot/student")
  public Object students() {
    //多线程并发访问
    ExecutorService executorService = Executors.newFixedThreadPool(32);
    for (int i = 0; i < 1000; i++) {
      executorService.submit(new Runnable() {
        @Override
        public void run() {
          studentService.getAllStudent();
        }
      });
    }

    return studentService.getAllStudent();
  }

  @RequestMapping("/boot/update")
  public @ResponseBody
  String updateStudent() {
    return String.valueOf(studentService.updateStudent());
  }

}
