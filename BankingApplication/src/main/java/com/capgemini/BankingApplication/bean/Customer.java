package com.capgemini.BankingApplication.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int customerId;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNo;
	
	@OneToOne
	private Address address;
	
	//Getter and setters 
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	//Parameterized Constructor 
	
	public Customer(String customerName, String customerEmail, String customerPhoneNo) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhoneNo = customerPhoneNo;
	}

	
	//Empty Constructor
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
