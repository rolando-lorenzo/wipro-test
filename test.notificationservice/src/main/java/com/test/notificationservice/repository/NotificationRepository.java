package com.test.notificationservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.notificationservice.model.UserNotification;

@Repository
public interface NotificationRepository extends CrudRepository<UserNotification, Long> {
	
	UserNotification findById(Long id);
	
	

}
