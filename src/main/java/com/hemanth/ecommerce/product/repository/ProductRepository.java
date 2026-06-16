package com.hemanth.ecommerce.product.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.hemanth.ecommerce.product.model.Product;


public interface ProductRepository 
extends MongoRepository<Product, String> {


}