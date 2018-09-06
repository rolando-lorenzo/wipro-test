package com.test.accountservice.client;

import org.springframework.cloud.netflix.feign.FeignClient;


@FeignClient("notificationservice")
public interface NotificationFeignClient {
	
	//@RequestMapping(value="/v1/user/{username}", consumes = "application/json")
	//User getUserByUsername(@PathVariable("username") String username);
}
