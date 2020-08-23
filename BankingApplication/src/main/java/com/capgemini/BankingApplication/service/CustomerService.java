package com.capgemini.BankingApplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.BankingApplication.bean.Address;
import com.capgemini.BankingApplication.bean.Customer;
import com.capgemini.BankingApplication.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AddressService addressService;

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepository.findAll();
	}
	public Customer getCustomer(long cid) {
		// TODO Auto-generated method stub
		List<Customer> customer = getAllCustomers();
		for(Customer c : customer) {
			if(c.getCustomerId()==cid) {
				return c;
			}
		}
		return null;
	}


	public void addCustomer(Customer customer,int addressId) {
		// TODO Auto-generated method stub
		Address address=addressService.getAddress(addressId);
		customer.setAddress(address);
		customerRepository.save(customer);
	}

	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(customerId);
	}

	public void updateCustomer(Customer customer, int customerId) {
		// TODO Auto-generated method stub
		if(customerRepository.existsById(customerId)){
			List<Customer> customers=new ArrayList<>();
			customerRepository.findAll().forEach(customers::add);
			for(Customer c:customers) {
				if(c.getCustomerId()==customerId) {
					Address address=addressService.getAddress(c.getAddress().getAddressId());
					customer.setAddress(address);
					customerRepository.save(customer);
				}
			}
			
	}}




}
