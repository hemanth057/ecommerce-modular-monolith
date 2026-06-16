package com.hemanth.ecommerce.payment.controller;


import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hemanth.ecommerce.payment.model.Payment;
import com.hemanth.ecommerce.payment.service.PaymentService;



@RestController
@RequestMapping("/api/payments")
public class PaymentController {



    private final PaymentService paymentService;




    public PaymentController(PaymentService paymentService) {


        this.paymentService = paymentService;


    }






    @PostMapping
    public Payment makePayment(
            @RequestBody Payment payment) {



        return paymentService.makePayment(payment);



    }








    @GetMapping
    public List<Payment> getPayments() {



        return paymentService.getAllPayments();



    }








    @GetMapping("/{id}")
    public Payment getPayment(
            @PathVariable String id) {



        return paymentService.getPaymentById(id);



    }








    @DeleteMapping("/{id}")
    public String deletePayment(
            @PathVariable String id) {




        paymentService.deletePayment(id);



        return "Payment Deleted Successfully";



    }



}