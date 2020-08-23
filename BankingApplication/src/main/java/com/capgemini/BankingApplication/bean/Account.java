package com.capgemini.BankingApplication.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Account {
	@Id
	@GeneratedValue
	private long accountNo;
	private double accountBalance;
	private String accountType;
	
	@OneToOne
	private Customer customer;

	//Getters and setters
	
	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	//Parameterized Constructor

	public Account(double accountBalance, String accountType) {
		super();
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}
	
	//Constructor
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
	
	

}
