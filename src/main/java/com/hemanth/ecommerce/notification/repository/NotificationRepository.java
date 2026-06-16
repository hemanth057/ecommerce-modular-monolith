package com.hemanth.ecommerce.notification.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.hemanth.ecommerce.notification.model.Notification;


public interface NotificationRepository 
extends MongoRepository<Notification, String> {


}