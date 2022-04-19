package com.example.webclients1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.webclients1.Entity.BikeEntity;

import reactor.core.publisher.Mono;

@Service

public class BikeService 
{
	@Autowired
	WebClient webclient;
	
	public Mono<BikeEntity> getById(Integer carId)
	{
		return webclient.get()
				.uri("/view/{carId}",carId)
				.retrieve()
				.bodyToMono(BikeEntity.class);

	
	}
}

	