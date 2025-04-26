package com.jalilzod_art.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


public class OrderService {


    private PaymentService paymentService;
    @Value("${stripe.apiUrl}")
    private String stripeUrl;
    @Value("${stripe.enabled}")
    private boolean isEnabled;
    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCrn;
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("Constructor created...");
    }
    public void placeOrder(double amount){
        paymentService.processPayment(amount);
    }
    @PostConstruct
    public void init(){
        System.out.println("after constructor ...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroyed...");
    }
}
