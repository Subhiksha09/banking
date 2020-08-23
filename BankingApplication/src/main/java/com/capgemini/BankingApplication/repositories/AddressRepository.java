package com.capgemini.BankingApplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.BankingApplication.bean.Address;

public interface AddressRepository extends CrudRepository<Address, Integer>{

}
