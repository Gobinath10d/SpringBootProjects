package com.example.rabbitmqconsumers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqConsumersApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqConsumersApplication.class, args);
		System.out.println("Reciver");
	}

}
