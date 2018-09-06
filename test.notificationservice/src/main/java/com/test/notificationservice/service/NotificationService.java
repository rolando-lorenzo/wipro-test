package com.test.notificationservice.service;

import com.test.notificationservice.model.NotificationRequest;
import com.test.notificationservice.model.NotificationResponse;

public interface NotificationService {
	
	NotificationResponse getCurrentAccNotificationSettings(Long userId);
	
	String saveCurrentAccNotificationSettings(NotificationRequest request);

}
