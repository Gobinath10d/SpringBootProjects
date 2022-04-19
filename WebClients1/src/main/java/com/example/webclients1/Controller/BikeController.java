package com.example.webclients1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.webclients1.Entity.BikeEntity;
import com.example.webclients1.Service.BikeService;

import reactor.core.publisher.Mono;

@RestController

public class BikeController {
	@Autowired
	BikeService bikeservice;
	
	
	@GetMapping("/view/{carId}")
	public Mono<BikeEntity> getByid(@PathVariable Integer carId)
	{
    
		return bikeservice.getById(carId);
		
	}


}
