package com.capgemini.BankingApplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.BankingApplication.bean.Account;

public interface AccountRepository extends CrudRepository<Account ,Long>{

}
