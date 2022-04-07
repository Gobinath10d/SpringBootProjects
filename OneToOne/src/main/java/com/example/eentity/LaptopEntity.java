package com.example.eentity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Laptop")

public class LaptopEntity {
	@Id
	int lapId;
	String lapName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stu_Id")
	private EmployeeEntity employeeEntity;
	
	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}
	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}
	public String getLapName() {
		return lapName;
	}
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	public void setLapName(String lapName) {
		this.lapName = lapName;
	}
	

}
