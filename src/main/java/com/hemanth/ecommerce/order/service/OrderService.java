package com.hemanth.ecommerce.order.service;


import java.time.LocalDateTime;
import java.util.List;


import org.springframework.stereotype.Service;


import com.hemanth.ecommerce.order.model.Order;
import com.hemanth.ecommerce.order.repository.OrderRepository;


@Service
public class OrderService {


    private final OrderRepository orderRepository;



    public OrderService(OrderRepository orderRepository) {

        this.orderRepository = orderRepository;

    }





    public Order createOrder(Order order) {


        order.setStatus("CREATED");


        order.setOrderDate(LocalDateTime.now());


        return orderRepository.save(order);


    }






    public List<Order> getAllOrders() {


        return orderRepository.findAll();


    }






    public Order getOrderById(String id) {


        return orderRepository.findById(id)
                .orElse(null);


    }







    public void deleteOrder(String id) {


        orderRepository.deleteById(id);


    }



}
