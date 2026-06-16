package com.hemanth.ecommerce.payment.model;


import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "payments")
public class Payment {


    @Id
    private String id;


    private String orderId;


    private double amount;


    private String paymentMode;


    private String status;


    private LocalDateTime paymentDate;




    public Payment() {


    }





    public String getId() {

        return id;

    }



    public void setId(String id) {

        this.id = id;

    }






    public String getOrderId() {

        return orderId;

    }



    public void setOrderId(String orderId) {

        this.orderId = orderId;

    }






    public double getAmount() {

        return amount;

    }



    public void setAmount(double amount) {

        this.amount = amount;

    }






    public String getPaymentMode() {

        return paymentMode;

    }



    public void setPaymentMode(String paymentMode) {

        this.paymentMode = paymentMode;

    }






    public String getStatus() {

        return status;

    }



    public void setStatus(String status) {

        this.status = status;

    }







    public LocalDateTime getPaymentDate() {

        return paymentDate;

    }



    public void setPaymentDate(LocalDateTime paymentDate) {

        this.paymentDate = paymentDate;

    }



}