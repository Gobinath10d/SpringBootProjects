package com.example.manytomany.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "Product")

public class ProductEntity {
	
	@Id
	int prodId;
	String prodName;
	int prodPrice; 
	
	@JsonIgnore
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Customer_Product")
	List<CustomerEntity>  customer;
	
	
	
	
	public List<CustomerEntity> getCustomer() {
		return customer;
	}
	public void setCustomer(List<CustomerEntity> customer) {
		this.customer = customer;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	

}
