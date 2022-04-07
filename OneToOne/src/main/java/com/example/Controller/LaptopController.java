package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.LaptopService;
import com.example.eentity.LaptopEntity;

@RestController
@RequestMapping("/employyee")
public class LaptopController 
{
	@Autowired
	LaptopService lapservice;
	
	@PostMapping("/lapinsert")
	public String insertLapdetails(@RequestBody List<LaptopEntity>lapentity)
	{
		return lapservice.insertLapdetails(lapentity);
		
	}
	
	@GetMapping("/lapview")
	public List<LaptopEntity>getLapdetails()
	{
		return lapservice.getLapdetails();
		
	}
	
	@GetMapping("/view/{lapId}")
	public LaptopEntity getByLapId(@PathVariable Integer lapId)
	{
		return lapservice.getLaptopById(lapId);
		
	}

	@GetMapping("/get1lapview")
	public List<LaptopEntity>getAllval()
	{
		return lapservice.getAllval();
		
	}
	
	@GetMapping("/get2lapview")
	public List<LaptopEntity>invalues()
	{
		return lapservice.invalues();
		
	}
	
	@GetMapping("/view2/{lapName}")
	public LaptopEntity getByLapName(@PathVariable String lapName)
	{
		return lapservice.getByName(lapName);
		
	}
	
	@GetMapping("/criterialap")
	public List<LaptopEntity> getlap() 
	{
		return lapservice.getlaptop();
		
	}
}
