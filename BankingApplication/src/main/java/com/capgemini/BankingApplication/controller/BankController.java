package com.capgemini.BankingApplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.BankingApplication.bean.Customer;
import com.capgemini.BankingApplication.service.CustomerService;

@RestController
public class BankController {
	@Autowired
	private CustomerService customerService;
	
	//Customer Mapping Methods
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();	
	}
	@GetMapping("/customer/{customerId}")
	public Customer getCustomer(@PathVariable int customerId ) {
		// TODO Auto-generated method stub
		return customerService.getCustomer(customerId);
	}
	@PostMapping("/customer/{addressId}")
	public void addCustomer(@RequestBody Customer customer,@PathVariable int addressId) {
		customerService.addCustomer(customer,addressId);
	}
	@PutMapping("/customer/{customerId}")
	public void updateCustomer(@RequestBody Customer customer,@PathVariable int customerId ) {
		customerService.updateCustomer(customer,customerId);
	}
	
	@DeleteMapping("/customer/{customerId}")
	public void deleteCustomer(@PathVariable int customerId) {
		customerService.deleteCustomer(customerId);
	}

}
