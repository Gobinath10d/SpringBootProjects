package com.example.manytomany.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.manytomany.Entity.CustomerEntity;
import com.example.manytomany.Entity.ProductEntity;
import com.example.manytomany.Service.CusprodService;


@RestController

public class CusprodController {
	@Autowired
	CusprodService cusprodservice;
	
	@PostMapping("/cusinsert")
	public String insertcustomerdetails(@RequestBody List<CustomerEntity> customerentity) 
	{
		return cusprodservice.insertcustomerdetails(customerentity);
	}
	
	@GetMapping("/cusdisplay")
	public List<CustomerEntity> getcustomerdetails()
	{
		return cusprodservice.getcustomerdetails();		
	}
	
	@PostMapping("/prodinsert")
	public String insertproductdetails(@RequestBody List<ProductEntity> productentity)
	{
		return cusprodservice.insertproductdetails(productentity);
		
	}
	
	@GetMapping("/proddisplay")
	public List<ProductEntity> getproductdetails(){
		return cusprodservice.getproductdetails();
	}
/////////////////////////////////////////////////////////
	
	@PostMapping("custprod")
	public String custprod(@RequestParam long cusPhno,@RequestParam String prodName) 
	{
		System.out.println(cusPhno+" "+prodName);
		return cusprodservice.custprod(cusPhno, prodName);
	}

	@GetMapping("/display/{cusPhno}")
	public Optional<CustomerEntity> customerdetails(@PathVariable long cusPhno)
	{
		return cusprodservice.customerdetails(cusPhno);
	}
	
	@GetMapping("/display1/{prodName}")
	public  List<CustomerEntity> productdetails(@PathVariable String prodName)
	{
		return cusprodservice.findCusByProName(prodName);
	}
	
}
