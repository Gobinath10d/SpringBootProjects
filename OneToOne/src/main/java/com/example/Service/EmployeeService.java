package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.EmployeeRepository;
import com.example.Repository.LaptopRepository;
import com.example.eentity.EmployeeEntity;
import com.example.eentity.LaptopEntity;


@Service

public class EmployeeService {
	@Autowired
	EmployeeRepository Emprepo;
	@Autowired
	LaptopRepository laptopRepository;
	
	public String insertEmpdetails(List<EmployeeEntity>empentity) 
	{
		Emprepo.saveAll(empentity);
		return "insert success";
	}
	public LaptopEntity insertEmployee(LaptopEntity entity) {
		    EmployeeEntity emp = entity.getEmployeeEntity();
		    emp.setLaptopEntity(entity);
		    return laptopRepository.save(entity);
		  
	}
	
	public List<EmployeeEntity>getEmpdetails()
	{
		return Emprepo.findAll();
	}
	public String deleteEmpdetails (Integer id) {
		Emprepo.deleteById(id);
		return "Delete success";
		
	}
	public String updateEmpdetails(EmployeeEntity empentity) {
		Emprepo.save(empentity);
		return "Update success";
	}
	public List<EmployeeEntity> getAll() {
		
		return Emprepo.getAll();
	}
	

}
