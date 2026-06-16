package com.hemanth.ecommerce.notification.model;


import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "notifications")
public class Notification {


    @Id
    private String id;


    private String message;


    private String status;


    private LocalDateTime createdAt;




    public Notification() {


    }



    public String getId() {

        return id;

    }


    public void setId(String id) {

        this.id = id;

    }



    public String getMessage() {

        return message;

    }


    public void setMessage(String message) {

        this.message = message;

    }



    public String getStatus() {

        return status;

    }


    public void setStatus(String status) {

        this.status = status;

    }



    public LocalDateTime getCreatedAt() {

        return createdAt;

    }


    public void setCreatedAt(LocalDateTime createdAt) {

        this.createdAt = createdAt;

    }


}