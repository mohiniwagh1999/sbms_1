package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
  
	public static void main(String[] args) {
	ConfigurableApplicationContext c=SpringApplication.run(Application.class, args);
	
		//System.out.println(c.getBeanDefinitionCount());
	System.out.println(c.getClass().getName());
	
		
	}

}
