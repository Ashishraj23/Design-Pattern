package com.example.designPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

}
