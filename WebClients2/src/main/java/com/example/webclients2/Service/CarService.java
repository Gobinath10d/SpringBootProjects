package com.example.webclients2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webclients2.Entity.CarEntity;
import com.example.webclients2.Repository.CarRepository;

@Service

public class CarService {
	
	@Autowired
	CarRepository carrepository;
	
	public String insertcardetails(List<CarEntity> carentity) 
	{
		carrepository.saveAll(carentity);
		return "insert success";
	}
	
	public List<CarEntity>getcardetail()
	{
		return carrepository.findAll();
		
	}
	
	public Optional<CarEntity>getById(Integer id)
	{
		return carrepository.findById(id);
		
	}

}
