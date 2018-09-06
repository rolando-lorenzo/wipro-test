package com.test.accountservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.accountservice.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

	Account findById(Long id);
	
}
