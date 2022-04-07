package com.example.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.LaptopRepository;
import com.example.eentity.LaptopEntity;

@Service

public class LaptopService
{
	@Autowired
	LaptopRepository Laprepo;
	
	@Autowired
	EntityManager entityManager;
	
	public String insertLapdetails(List<LaptopEntity>lapentity) {
		Laprepo.saveAll(lapentity);
		return "insert successfully";
	}
	
	public List<LaptopEntity>getLapdetails()
	{
		return Laprepo.findAll();
	}
	
	public LaptopEntity getLaptopById(Integer lapId)
	{
		return Laprepo.getLapById(lapId);
	}
	

	public List<LaptopEntity>getAllval()
	{
		return Laprepo.getAllval();
	}
	
	public List<LaptopEntity>invalues()
	{
		return Laprepo.invalues();
	}
	
	public LaptopEntity getByName(String lapName)
	{
		return Laprepo.findByName(lapName);
	}
	
	
	//criteria builder
	
	@Transactional
	public List<LaptopEntity> getlaptop() 
	{    

	    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
	    CriteriaQuery<LaptopEntity> criteriaQuery = criteriaBuilder.createQuery(LaptopEntity.class);      
	    Root<LaptopEntity> studentRoot = criteriaQuery.from(LaptopEntity.class);
	    criteriaQuery.select(studentRoot);
	    
	    TypedQuery<LaptopEntity> typedQuery = entityManager.createQuery(criteriaQuery);
	    List<LaptopEntity> lapList = typedQuery.getResultList();
	    return lapList;

	}	
}



