package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.eentity.EmployeeEntity;
import com.example.eentity.LaptopEntity;

@Repository

public interface LaptopRepository extends JpaRepository<LaptopEntity, Integer>
{

	LaptopEntity save(EmployeeEntity emp);
	
	//native
	@Query(value="select * from laptop",nativeQuery =true)
	List<LaptopEntity>getAllvaluesc();
	
	@Query(value="select * from laptop where lap_name LIKE '%y' " ,nativeQuery = true)
	List<LaptopEntity>getAllval();
	
	@Query(value="select * from employee inner join laptop on employee.emp_id = laptop.lap_id" ,nativeQuery = true)
	List<LaptopEntity>invalues();
	
	
	//jpql
	@Query("select e from LaptopEntity e")
	List<LaptopEntity>getAllvaluescc();
   
	
	
	@Query("select e from LaptopEntity e  where e.lapId= :lapId")
	LaptopEntity getLapById(@Param("lapId")int lapId);
	
	@Query("select e from LaptopEntity e where e.lapName= ?1")
	LaptopEntity findByName(String lapName);
	
	
	
}
