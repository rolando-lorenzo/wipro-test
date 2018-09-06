package com.test.notificationservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.notificationservice.model.NotificationRequest;
import com.test.notificationservice.model.NotificationResponse;
import com.test.notificationservice.service.NotificationService;

@RestController
@RequestMapping
public class NotificationController {
	
	private static final Logger logger = LoggerFactory.getLogger(NotificationController.class);

	@Autowired
	private NotificationService notificationService;
	
	@GetMapping("/")
	public String sayHello() {
		return "Services notificaion up !!";
	}
	
	/**
	 * /notifications/settings/{user} Get current account notification settings
	 */
	@GetMapping("/settings/{user}")
	public NotificationResponse getCurrentAccNotificationSettings(@PathVariable Long user){
		return notificationService.getCurrentAccNotificationSettings(user);
	}
	
	/**
	 * /notifications/settings/ Save current account notification settings
	 */
	@PostMapping("/settings")
	public String saveCurrentAccNotificationSettings(@RequestBody NotificationRequest request) {
		return notificationService.saveCurrentAccNotificationSettings(request);
	}
	
}
