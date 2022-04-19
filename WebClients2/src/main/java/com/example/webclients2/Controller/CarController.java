package com.example.webclients2.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webclients2.Entity.CarEntity;
import com.example.webclients2.Service.CarService;

@RestController

public class CarController {
	
	@Autowired
	CarService carservice;
	
	@PostMapping("/insert")
	public String insertcardetails(@RequestBody List<CarEntity> carentity) {
		return carservice.insertcardetails(carentity);
		
	}
	
	@GetMapping("/display")
	public List<CarEntity>getcardetail(){
		return carservice.getcardetail();
		
	}
	
	@GetMapping("/view/{carId}")
	public Optional<CarEntity>getById(@PathVariable Integer carId){
		return carservice.getById(carId);
	}
}
