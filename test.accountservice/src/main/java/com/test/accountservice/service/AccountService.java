package com.test.accountservice.service;


import com.test.accountservice.model.Account;

public interface AccountService {
	
	Account newAccount( Account account);
	
	String updateAcount(Account account);
	
	Account getAccount(Long id); 

}