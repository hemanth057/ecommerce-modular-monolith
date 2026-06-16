package com.hemanth.ecommerce.product.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.hemanth.ecommerce.product.model.Product;
import com.hemanth.ecommerce.product.repository.ProductRepository;


@Service
public class ProductService {


    private final ProductRepository productRepository;



    public ProductService(ProductRepository productRepository) {

        this.productRepository = productRepository;

    }



    public Product addProduct(Product product) {


        return productRepository.save(product);

    }




    public List<Product> getAllProducts() {


        return productRepository.findAll();

    }




    public Product getProductById(String id) {


        return productRepository.findById(id)
                .orElse(null);

    }




    public void deleteProduct(String id) {


        productRepository.deleteById(id);

    }


}
