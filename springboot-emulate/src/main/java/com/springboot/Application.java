package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan  //启动自动搜索bean
@EnableAutoConfiguration  //启动bean自动注入
@MapperScan("com.springboot.mapper")  //注入mapper接口类
@EnableTransactionManagement    //开启事务
public class Application {

  public static void main(String[] args) {

    //启动springboot程序，启动spring容器，启动内嵌的tomcat

    SpringApplication.run(Application.class, args);

  }
}
