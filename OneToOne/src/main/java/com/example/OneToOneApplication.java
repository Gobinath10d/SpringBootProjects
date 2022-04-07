package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
		System.out.println("one to one run success");
	}

}
