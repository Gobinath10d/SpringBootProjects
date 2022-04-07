package com.example.eentity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Employee")

public class EmployeeEntity {
	@Id
	int empId;
	String empName;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "employeeEntity")
	
	private LaptopEntity laptopEntity;
	
	
	public LaptopEntity getLaptopEntity() {
		return laptopEntity;
	}
	public void setLaptopEntity(LaptopEntity laptopEntity) {
		this.laptopEntity = laptopEntity;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

}
