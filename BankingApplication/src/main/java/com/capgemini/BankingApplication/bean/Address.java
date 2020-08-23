package com.capgemini.BankingApplication.bean;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;

	@Entity
	public class Address {
	    @Id
	    @GeneratedValue
	    private int addressId;
	    private String addressLine;
	    private String city;
	    private String state;
	    private int pincode;
	    
	    
	    //Getters and setters 
	    
	    public int getAddressId() {
	        return addressId;
	    }
	    public String getAddressLine() {
			return addressLine;
		}
		public void setAddressLine(String addressLine) {
			this.addressLine = addressLine;
		}
		public void setAddressId(int addressId) {
	        this.addressId = addressId;
	    }    
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public String getState() {
	        return state;
	    }
	    public void setState(String state) {
	        this.state = state;
	    }
	    public int getPincode() {
	        return pincode;
	    }
	    public void setPincode(int pincode) {
	        this.pincode = pincode;
	    }
	    
	    //Parameterized Constructor
	    
	    public Address( String city, String state, int pincode) {
	        super();
	        this.city = city;
	        this.state = state;
	        this.pincode = pincode;
	    }
	    
	    //Constructor
	    
	    public Address() {
	        super();
	    }
	 
	    
	    
	    
	}

