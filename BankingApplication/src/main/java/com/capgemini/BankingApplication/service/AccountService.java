package com.capgemini.BankingApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.BankingApplication.bean.Account;
import com.capgemini.BankingApplication.bean.Customer;
import com.capgemini.BankingApplication.repositories.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private CustomerService customerService;
	
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return  (List<Account>) accountRepository.findAll();
	}

//	public void addAccount(Account account) {
//		// TODO Auto-generated method stub
//		accountRepository.save(account);
//		
//	}

	public Account getAccount(long acc_id) {
		// TODO Auto-generated method stub
		List<Account> accounts = getAllAccounts();
		for(Account acc : accounts) {
			if(acc.getAccountNo()==acc_id) {
				return acc;
			}
		}
		return null;
	}

	public void updateAccount(long acc_id, Account account) {
		// TODO Auto-generated method stub
		account.setAccountNo(acc_id);
		List<Customer> customers = customerService.getAllCustomers();
		Account acc = getAccount(acc_id);
		int customer_id=acc.getCustomer().getCustomerId();
		for(Customer c: customers) {
			if(c.getCustomerId()==customer_id) {
				account.setCustomer(c);
			}
		}
		accountRepository.save(account);
	}

	public void addAccount(Account account, long cid) {
		// TODO Auto-generated method stub
			Customer customer = customerService.getCustomer(cid);
			account.setCustomer(customer);
			accountRepository.save(account);
		}

	public void deleteAccount(long acc_id) {
		// TODO Auto-generated method stub
		accountRepository.deleteById(acc_id);
	}
	

}
