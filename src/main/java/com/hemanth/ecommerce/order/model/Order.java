package com.hemanth.ecommerce.order.model;


import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "orders")
public class Order {


    @Id
    private String id;


    private String productName;


    private int quantity;


    private double totalAmount;


    private String status;


    private LocalDateTime orderDate;




    public Order() {


    }




    public String getId() {

        return id;

    }



    public void setId(String id) {

        this.id = id;

    }




    public String getProductName() {

        return productName;

    }



    public void setProductName(String productName) {

        this.productName = productName;

    }




    public int getQuantity() {

        return quantity;

    }



    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }





    public double getTotalAmount() {

        return totalAmount;

    }



    public void setTotalAmount(double totalAmount) {

        this.totalAmount = totalAmount;

    }





    public String getStatus() {

        return status;

    }



    public void setStatus(String status) {

        this.status = status;

    }




    public LocalDateTime getOrderDate() {

        return orderDate;

    }



    public void setOrderDate(LocalDateTime orderDate) {

        this.orderDate = orderDate;

    }



}