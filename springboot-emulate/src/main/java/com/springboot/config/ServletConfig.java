package com.springboot.config;

import com.springboot.servlet.SecondServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
  @Bean
  public ServletRegistrationBean  getSecondServlet(){
    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SecondServlet(),"/secondServlet");
    return servletRegistrationBean;
  }
}
