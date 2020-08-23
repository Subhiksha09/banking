package com.capgemini.BankingApplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.BankingApplication.bean.BankTransact;

public interface BankTransactionRepository extends CrudRepository<BankTransact, Integer>{

}
