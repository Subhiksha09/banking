package com.capgemini.BankingApplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.BankingApplication.bean.Account;
import com.capgemini.BankingApplication.bean.BankTransact;
import com.capgemini.BankingApplication.repositories.AccountRepository;
import com.capgemini.BankingApplication.repositories.BankTransactionRepository;

@Service
public class BankTransactionService {
	@Autowired
	private BankTransactionRepository bankTransactionRepository;
	@Autowired
	private AccountService accountService;
	@Autowired
	private AccountRepository accountRepository;
	
	public List<BankTransact> getAllTransactions() {
		// TODO Auto-generated method stub
		return (List<BankTransact>) bankTransactionRepository.findAll();
	}

	public void addTransaction(BankTransact bankTransact) {
		// TODO Auto-generated method stub
		/*List<Account> accounts=new ArrayList<>();
		accounts=accountService.getAllAccounts();
		for(Account a: accounts	) {
			if(a.getAccountNo()==accNo) {
				bankTransact.setAccount(a);
			}
		}
		bankTransactionRepository.save(bankTransact);
		long accNo=bankTransact.getFromAccount();
		Account account = accountService.getAccount(accNo);
		if(bankTransact.getTransactionType().equalsIgnoreCase("debit")) {
			account=depositTransact(bankTransact.getTransactionAmount(), accNo);
			bankTransact.setAccount(account);
			bankTransact.setToAccount(0);
		}
		else if(bankTransact.getTransactionType().equalsIgnoreCase("credit")) {
			account=withDrawTransact(bankTransact.getTransactionAmount(), accNo);
			bankTransact.setAccount(account);
			bankTransact.setToAccount(0);
		}
		else if(bankTransact.getTransactionType().equalsIgnoreCase("fund transfer")) {
			
		}
		
		bankTransactionRepository.save(bankTransact);*/
		List<Account> accounts =new ArrayList();
		if(bankTransact.getTransactionType().equals("debit")) {
			accounts=accountService.getAllAccounts();
			for (Account a:accounts) {
				if(a.getAccountNo()==bankTransact.getFromAccount()) {
				double amount=a.getAccountBalance()-bankTransact.getTransactionAmount();
				System.out.println(amount);
				a.setAccountBalance(amount);
				accountRepository.save(a);
				bankTransactionRepository.save(bankTransact);
				
				}
			}
			
		}
		else if(bankTransact.getTransactionType().equals("credit")) {
			accounts=accountService.getAllAccounts();
			for (Account a:accounts) {
				if(a.getAccountNo()==bankTransact.getFromAccount()) {
				double amount=a.getAccountBalance()+bankTransact.getTransactionAmount();
				System.out.println(amount);
				a.setAccountBalance(amount);
				accountRepository.save(a);
				bankTransactionRepository.save(bankTransact);
				
				}
			}
			
		}
		else if(bankTransact.getTransactionType().equals("fund")) {
			accounts=accountService.getAllAccounts();
			for (Account a:accounts) {
				if(a.getAccountNo()==bankTransact.getFromAccount()) {
				double amount=a.getAccountBalance()-bankTransact.getTransactionAmount();
				//System.out.println(amount);
				a.setAccountBalance(amount);
				accountRepository.save(a);
			//	bankTransactionRepository.save(bankTransact);
				
				}}
				for (Account a1:accounts) {
					if(a1.getAccountNo()==bankTransact.getToAccount()) {
					double amount=a1.getAccountBalance()+bankTransact.getTransactionAmount();
					//System.out.println(amount);
					a1.setAccountBalance(amount);
					accountRepository.save(a1);
				//	bankTransactionRepository.save(bankTransact);
					
					}
			}
			
		}
		
	}

	public void deleteTransaction(int tid) {
		// TODO Auto-generated method stub
		bankTransactionRepository.deleteById(tid);
	}
	private Account depositTransact(int amount,long accNO) {
		
			Account account = accountService.getAccount(accNO);
			account.setAccountBalance(account.getAccountBalance()+amount);
			return account;
		
		
	}
	private Account withDrawTransact(int amount,long accNO) {
		
		Account account = accountService.getAccount(accNO);
		account.setAccountBalance(account.getAccountBalance()-amount);
		return account;
	
	
}
}
