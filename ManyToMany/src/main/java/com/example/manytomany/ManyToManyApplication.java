package com.example.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
		System.out.println("Many To Many Running Sucessfully");
	}

}