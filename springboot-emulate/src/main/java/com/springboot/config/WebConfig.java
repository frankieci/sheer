package com.springboot.config;

import com.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    //拦截的路径
    String [] addPathPatterns ={"/boot/config"};
    //不拦截的路径
    String  [] excludePathPatterns = {"/boot/hello"};
    registry.addInterceptor(new LoginInterceptor())
            .addPathPatterns(addPathPatterns)
            .excludePathPatterns(excludePathPatterns);
  }
}
