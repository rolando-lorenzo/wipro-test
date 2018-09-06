package com.test.accountservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.accountservice.model.Account;
import com.test.accountservice.service.AccountService;


@RestController
@RequestMapping
public class AccountController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Autowired
	private AccountService accountService;
	
	@GetMapping("/")
	public String sayHello() {
		return "Services account up !!";
	}
	
	/**
	 * accounts/{account} Get specified account data
	 */
	@GetMapping("/{account}")
	public Account getAccount(@PathVariable Long account) {
		return accountService.getAccount(account);
	}
	
	/**
	 * /accounts/ Register new account
	 */
	@PostMapping("/")
	public Account newAccount(@RequestBody Account account) {
		return accountService.newAccount(account);
	}
	
	/**
	 * /accounts/ Save account data
	 * @param account
	 * @return
	 */
	@PutMapping
	public String updateAccount(@RequestBody Account account) {
		return accountService.updateAcount(account);
	}
	
	
	
}
