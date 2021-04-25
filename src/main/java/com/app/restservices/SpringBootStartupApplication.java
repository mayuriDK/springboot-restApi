package com.app.restservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.app.restservices.hello.HelloWorldController;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloWorldController.class)
public class SpringBootStartupApplication {
//First class
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartupApplication.class, args);
	}

}
