package com.hemanth.ecommerce.auth.repository;


import org.springframework.data.mongodb.repository.MongoRepository;


import com.hemanth.ecommerce.auth.model.User;



public interface UserRepository 
extends MongoRepository<User, String> {



    User findByEmail(String email);



}