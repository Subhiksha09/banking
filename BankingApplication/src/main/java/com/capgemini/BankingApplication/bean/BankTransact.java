package com.capgemini.BankingApplication.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class BankTransact {
	@Id
	@GeneratedValue
	private int trans_id;
	private String trans_date;
	private long fromAccount;
	private long toAccount;
	private int transactionAmount;
	private String transactionType;
	@OneToOne
	private Account account;
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}

	public String getTrans_date() {
		return trans_date;
	}

	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}

	public long getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(long fromAccount) {
		this.fromAccount = fromAccount;
	}

	public long getToAccount() {
		return toAccount;
	}

	public void setToAccount(long toAccount) {
		this.toAccount = toAccount;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public BankTransact(String trans_date, long fromAccount, long toAccount, int transactionAmount,
			String transactionType) {
		super();
		this.trans_date = trans_date;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transactionAmount = transactionAmount;
		this.transactionType = transactionType;
	}

	public BankTransact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
