package com.hemanth.ecommerce.payment.service;


import java.time.LocalDateTime;
import java.util.List;


import org.springframework.stereotype.Service;


import com.hemanth.ecommerce.payment.model.Payment;
import com.hemanth.ecommerce.payment.repository.PaymentRepository;


@Service
public class PaymentService {


    private final PaymentRepository paymentRepository;



    public PaymentService(PaymentRepository paymentRepository) {

        this.paymentRepository = paymentRepository;

    }





    public Payment makePayment(Payment payment) {


        payment.setStatus("SUCCESS");


        payment.setPaymentDate(LocalDateTime.now());


        return paymentRepository.save(payment);


    }






    public List<Payment> getAllPayments() {


        return paymentRepository.findAll();


    }






    public Payment getPaymentById(String id) {


        return paymentRepository.findById(id)
                .orElse(null);


    }







    public void deletePayment(String id) {


        paymentRepository.deleteById(id);


    }



}