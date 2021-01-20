package com.springboot.config;

import com.springboot.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class FilterConfig {
  @Bean
  public  FilterRegistrationBean  getSecondFilter(){
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecondFilter());
    //解决字符编码
    CharacterEncodingFilter ceFilter = new CharacterEncodingFilter();
    ceFilter.setForceEncoding(true);
    ceFilter.setEncoding("UTF-8");
    filterRegistrationBean.setFilter(ceFilter);

    filterRegistrationBean.addUrlPatterns("/*");
    return filterRegistrationBean;
  }
}
