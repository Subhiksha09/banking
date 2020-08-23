package com.capgemini.BankingApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.BankingApplication.bean.Address;
import com.capgemini.BankingApplication.repositories.AddressRepository;

@Service
public class AddressService {
	
	 	@Autowired
	    private AddressRepository addressReposit;

	
	    public List<Address> getAllAddress() {
	        // TODO Auto-generated method stub
	        return (List<Address>) addressReposit.findAll();
	    }
	    
	    public void addAddress(Address address) {
	        // TODO Auto-generated method stub
	        addressReposit.save(address);
	    }

	    public Address getAddress(int aid) {
	        // TODO Auto-generated method stub
	        List<Address> addressList = getAllAddress();
	        for(Address a : addressList) {
	            if(a.getAddressId()==aid) {
	                return a;
	            }
	        }
	        return null;
	    }

	    public void updateAddress(Address address, int aid) {
	        // TODO Auto-generated method stub
	        address.setAddressId(aid);
	        addressReposit.save(address);
	    }

	    public void deleteAddress(int aid) {
	        // TODO Auto-generated method stub
	        addressReposit.deleteById(aid);
	    }

}
