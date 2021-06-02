package com.javatechie.curd.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EntityScan("com.javatechie.curd.example.entity")
@EnableAutoConfiguration
@SpringBootApplication
public class SprintBootCurdExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootCurdExampleApplication.class, args);
	}

}
