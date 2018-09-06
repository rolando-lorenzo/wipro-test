package com.test.notificationservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.notificationservice.client.AccountFeignClient;
import com.test.notificationservice.model.Account;
import com.test.notificationservice.model.NotificationRequest;
import com.test.notificationservice.model.NotificationResponse;
import com.test.notificationservice.model.UserNotification;
import com.test.notificationservice.repository.NotificationRepository;
import com.test.notificationservice.service.NotificationService;

@Service("notificationService")
public class NotificationServiceImpl implements NotificationService{

	@Autowired
	private NotificationRepository notificationRepository;
	
	@Autowired
	private AccountFeignClient accountFeignClient;
	
	@Override
	public NotificationResponse getCurrentAccNotificationSettings(Long userId) {
		NotificationResponse response = new NotificationResponse();
		
		//Consultar Notification
		UserNotification userNotification = notificationRepository.findById(userId);
		response.setUserNotification(userNotification);
		
		//Consultar Account
		Account account = accountFeignClient.getAccount(userNotification.getAccountId());
		response.setAccount(account);
		return response;
	}

	@Override
	public String saveCurrentAccNotificationSettings(NotificationRequest request) {
		
		String response = null;
		//Guardar Account
		Account account = accountFeignClient.newAccount(request.getAccount());
		if(account != null){
			response = "Se guardo correctamente el account "+account.getId();
		} else {
			response = "Ocurrio un error al guardar Account ";
		}
		//Guardar Notification
		UserNotification userNotification = notificationRepository.save(request.getUserNotification());
		
		if(userNotification != null){
			response= response+ ", Se guardo correctamente el Account Notification Settings "+userNotification.getId();
		} else {
			response = response +", Ocurrio un error al guardar el NotificationSettings";
		}
		return response;
	}

}
