package com.capgemini.BankingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.BankingApplication.bean.BankTransact;
import com.capgemini.BankingApplication.service.BankTransactionService;
@RestController
public class BankTransactionController {
	
	@Autowired
	private BankTransactionService bankTransactionService;
	
	
	@GetMapping("/trans")
	public List<BankTransact> getAllTransactions(){
		return  bankTransactionService.getAllTransactions();
	}
	@PostMapping("/trans")
	public void addTransaction(@RequestBody BankTransact transactionClass) {
		bankTransactionService.addTransaction(transactionClass);
	}
	
	@DeleteMapping("trans/{tid}")
	public void deleteTransaction(@PathVariable int tid) {
		bankTransactionService.deleteTransaction(tid);	
	}
}
