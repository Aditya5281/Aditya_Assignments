package com.SpringBootDemo.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringBootDemoApplication.class, args);
	
	    for(String name : applicationContext.getBeanDefinitionNames()) {
	    	System.out.println(name);
	    }
	    
	} 

}
 