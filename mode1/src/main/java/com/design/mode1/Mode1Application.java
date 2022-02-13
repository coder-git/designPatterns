package com.design.mode1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mode1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mode1Application.class, args);  
		
		System.out.println(NumberFactory.getFactory().parse("12321.321321"));
		System.out.println(NumberFactory.imple.parse("12321321.231312"));
	}
	
	
	

}
