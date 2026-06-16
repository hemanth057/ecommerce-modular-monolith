package com.hemanth.ecommerce.notification.service;


import java.time.LocalDateTime;
import java.util.List;


import org.springframework.stereotype.Service;


import com.hemanth.ecommerce.notification.model.Notification;
import com.hemanth.ecommerce.notification.repository.NotificationRepository;



@Service
public class NotificationService {


    private final NotificationRepository notificationRepository;



    public NotificationService(NotificationRepository notificationRepository) {


        this.notificationRepository = notificationRepository;


    }




    public Notification sendNotification(Notification notification) {


        notification.setStatus("SENT");


        notification.setCreatedAt(LocalDateTime.now());


        return notificationRepository.save(notification);


    }





    public List<Notification> getAllNotifications() {


        return notificationRepository.findAll();


    }





    public void deleteNotification(String id) {


        notificationRepository.deleteById(id);


    }



}