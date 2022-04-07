package com.example.manytomany.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manytomany.Entity.CustomerEntity;
import com.example.manytomany.Entity.ProductEntity;
import com.example.manytomany.Repository.CustomerRepository;
import com.example.manytomany.Repository.ProductRepository;

@Service

public class CusprodService {
	@Autowired
	CustomerRepository customerrepository;
	@Autowired
	ProductRepository productrepository;
	
	public String insertcustomerdetails(List<CustomerEntity> customerentity) 
	{
		customerrepository.saveAll(customerentity);
		return "Customer value insert sucessfully";		
	}
	
	public List<CustomerEntity> getcustomerdetails()
	{
		return customerrepository.findAll();		
	}
	
	public String insertproductdetails(List<ProductEntity> productentity) 
	{
		productrepository.saveAll(productentity);
		return "Product value insert sucessfully";
	}
	
	public List<ProductEntity> getproductdetails()
	{
		return productrepository.findAll();
	}
	
	
	///////////////////////////////////
	
	public String custprod(long cusPhno,String prodName)
	{
		Optional<CustomerEntity>cus = customerrepository.findByCusPhno(cusPhno);
		Optional<ProductEntity>pro = productrepository.findByprodName(prodName);
		
		if(cus.isPresent() && pro.isPresent())
		{
		
			CustomerEntity customerentity = cus.get();
			ProductEntity productentity = pro.get();
			

			List<CustomerEntity>cuss = productentity.getCustomer();
			cuss.add(customerentity);
			productentity.setCustomer(cuss);
			
			List<ProductEntity>prod = customerentity.getProduct();
			prod.add(productentity);
			customerentity.setProduct(prod);


		  	customerrepository.save(customerentity);
			productrepository.save(productentity);
			
			return "sucessfully insert";
			
		}
		
		 return "failed";
				
	}
	
	public Optional<CustomerEntity> customerdetails(long cusPhno)
	{
		return customerrepository.findByCusPhno(cusPhno);
	    
	}
	
	
	public  List<CustomerEntity> findCusByProName(String prodName)
	{
		Optional<ProductEntity> proOpt = productrepository.findByprodName(prodName);
		if (proOpt.isPresent()) 
		{
		List<CustomerEntity>	customerEntity = proOpt.get().getCustomer();
		return customerEntity;
		}
		else 
		{
			return null ; 
		}
	
	}
	

	
}
