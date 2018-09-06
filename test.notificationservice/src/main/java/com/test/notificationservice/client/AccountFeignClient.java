package com.test.notificationservice.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.notificationservice.model.Account;

import feign.Headers;


@FeignClient("accountservice")
public interface AccountFeignClient {
	
	@RequestMapping(value="/{account}", consumes = "application/json", method = RequestMethod.GET)
	public Account getAccount(@PathVariable("account") Long account);
	
	@RequestMapping(value="/", consumes = "application/json", method = RequestMethod.POST)
	@Headers("Content-Type: application/json")
	public Account newAccount(@RequestBody Account account);
}
