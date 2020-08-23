package com.capgemini.BankingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.BankingApplication.bean.Address;
import com.capgemini.BankingApplication.service.AddressService;

@RestController
public class AddressController {
	 @Autowired
	    private AddressService addressService;
	    
	    @GetMapping("/address")
	    public List<Address> getAllAddress(){
	        return addressService.getAllAddress();
	    }
	    
	    @PostMapping(value="/address")
	    public void addAddress(@RequestBody Address address)
	    {
	        addressService.addAddress(address);
	    }
	    
	    @GetMapping("/address/{aid}")
	    public Address getAddress(@PathVariable int aid) {
	        return addressService.getAddress(aid);
	    }
	    
	    @PutMapping("/address/{aid}")
	    public void updateAddress(@PathVariable int aid,@RequestBody Address address) {
	        addressService.updateAddress(address,aid);
	    }
	    
	    @DeleteMapping("/address/{aid}")
	    public void deleteAddress(@PathVariable int aid) {
	        addressService.deleteAddress(aid);
	    }

}
