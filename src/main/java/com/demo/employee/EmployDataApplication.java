package com.demo.employee;

import org.slf4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EmployDataApplication {

Logger log= org.slf4j.LoggerFactory.getLogger(EmployDataApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(EmployDataApplication.class, args);
	}

	
}
