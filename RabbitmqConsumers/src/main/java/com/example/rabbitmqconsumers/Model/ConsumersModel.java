package com.example.rabbitmqconsumers.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table 
public class ConsumersModel {
	@Id
	int customerId;
	String customerName;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "ConsumersModel [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	
	
	

}
