package com.hemanth.ecommerce.product.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hemanth.ecommerce.product.model.Product;
import com.hemanth.ecommerce.product.service.ProductService;


@RestController
@RequestMapping("/api/products")
public class ProductController {


    private final ProductService productService;



    public ProductController(ProductService productService) {

        this.productService = productService;

    }



    @PostMapping
    public Product addProduct(
            @RequestBody Product product) {


        return productService.addProduct(product);

    }



    @GetMapping
    public List<Product> getProducts() {


        return productService.getAllProducts();

    }




    @GetMapping("/{id}")
    public Product getProduct(
            @PathVariable String id) {


        return productService.getProductById(id);

    }




    @DeleteMapping("/{id}")
    public String deleteProduct(
            @PathVariable String id) {


        productService.deleteProduct(id);


        return "Product Deleted Successfully";

    }


}