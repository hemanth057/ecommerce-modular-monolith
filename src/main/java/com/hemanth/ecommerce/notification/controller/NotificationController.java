package com.hemanth.ecommerce.notification.controller;


import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hemanth.ecommerce.notification.model.Notification;
import com.hemanth.ecommerce.notification.service.NotificationService;




@RestController
@RequestMapping("/api/notifications")
public class NotificationController {


    private final NotificationService notificationService;



    public NotificationController(NotificationService notificationService) {


        this.notificationService = notificationService;


    }




    @PostMapping
    public Notification send(
            @RequestBody Notification notification) {


        return notificationService.sendNotification(notification);


    }





    @GetMapping
    public List<Notification> getAll() {


        return notificationService.getAllNotifications();


    }






    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable String id) {



        notificationService.deleteNotification(id);



        return "Notification Deleted Successfully";


    }


}