package com.example.manytomany.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "Customer")

public class CustomerEntity {
	
	@Id
	int cusId;
	String cusName;
	long cusPhno;
	String cusAddress;
	
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "customer")
	private List<ProductEntity>product;
	
	
	
	
	public List<ProductEntity> getProduct() {
		return product;
	}
	public void setProduct(List<ProductEntity> product) {
		this.product = product;
	}
	
	
	public long getCusPhno() {
		return cusPhno;
	}
	public void setCusPhno(long cusPhno) {
		this.cusPhno = cusPhno;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	

}
