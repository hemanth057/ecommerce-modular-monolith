package com.hemanth.ecommerce.payment.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.hemanth.ecommerce.payment.model.Payment;


public interface PaymentRepository 
extends MongoRepository<Payment, String> {



}