package com.roshan.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Scanning external packages
//@SpringBootApplication(
//		scanBasePackages = {"com.roshan.util" , "com.roshan.springboot.app"}
//)

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
