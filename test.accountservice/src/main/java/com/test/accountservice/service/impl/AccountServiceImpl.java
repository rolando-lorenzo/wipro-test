package com.test.accountservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.accountservice.model.Account;
import com.test.accountservice.repository.AccountRepository;
import com.test.accountservice.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account newAccount(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public String updateAcount(Account account) {
		
		if(accountRepository.exists(account.getId())){
			accountRepository.save(account);
		} else {
			return "Registro no encontrado, favor de darlo de alta!";
		}
		return "Registro actualizado !!";
	}

	@Override
	public Account getAccount(Long id) {
		return accountRepository.findById(id);
	}

}
