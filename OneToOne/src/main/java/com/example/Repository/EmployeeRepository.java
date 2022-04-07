package com.example.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.internal.CriteriaImpl.Subcriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.eentity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>
{
    @Query(value="select * from  employee where emp_id=21",nativeQuery=true)
    List<EmployeeEntity>getAll();
    
    }
    


