package com.hemanth.ecommerce.order.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.hemanth.ecommerce.order.model.Order;


public interface OrderRepository 
extends MongoRepository<Order, String> {


}