package com.hemanth.ecommerce.order.controller;


import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hemanth.ecommerce.order.model.Order;
import com.hemanth.ecommerce.order.service.OrderService;



@RestController
@RequestMapping("/api/orders")
public class OrderController {


    private final OrderService orderService;




    public OrderController(OrderService orderService) {

        this.orderService = orderService;

    }




    @PostMapping
    public Order createOrder(
            @RequestBody Order order) {


        return orderService.createOrder(order);


    }






    @GetMapping
    public List<Order> getOrders() {


        return orderService.getAllOrders();


    }






    @GetMapping("/{id}")
    public Order getOrder(
            @PathVariable String id) {


        return orderService.getOrderById(id);


    }






    @DeleteMapping("/{id}")
    public String deleteOrder(
            @PathVariable String id) {


        orderService.deleteOrder(id);


        return "Order Deleted Successfully";


    }


}