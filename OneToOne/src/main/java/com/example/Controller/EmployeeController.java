package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.EmployeeService;
import com.example.eentity.EmployeeEntity;
import com.example.eentity.LaptopEntity;

@RestController
@RequestMapping("/employyee")

public class EmployeeController
{
	@Autowired
	EmployeeService empservice;
	
	
	@PostMapping("/insert")
	public String insertEmpdetails(@RequestBody List<EmployeeEntity>empentity) 
	{
		return empservice.insertEmpdetails(empentity);
		
		
	}
	@PostMapping("/in")
	public LaptopEntity insertEmployee(@RequestBody LaptopEntity entity)
	{
		return empservice.insertEmployee(entity);
		
	}

	
	
	@GetMapping("/view")
	public List<EmployeeEntity>getEmpdetails(){
		return empservice.getEmpdetails();
		
	}
	
	@GetMapping("/viewByQuery")
	public List<EmployeeEntity>getAll(){
		return empservice.getAll();
		
	}
	


}
