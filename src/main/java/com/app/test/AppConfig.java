package com.app.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
      public AppConfig()
      {
    	  System.out.println("inside app config");
      }
      
      @Bean
      public AppSecurity security()
      {
    	  AppSecurity as=new AppSecurity();
    	  //logic
    	  return as;
      }
}
