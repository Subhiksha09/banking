package com.capgemini.BankingApplication.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.BankingApplication.bean.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{



}
