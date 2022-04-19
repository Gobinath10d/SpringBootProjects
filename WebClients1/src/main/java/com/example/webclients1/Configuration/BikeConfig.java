package com.example.webclients1.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration

public class BikeConfig {

	@Bean
	public WebClient webclient() {
		WebClient webClient = WebClient
				.builder()
				.baseUrl("http://localhost:8090")
				.build();
		return webClient;

	}

}
