package com.jalilzod_art.demo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE..");
        System.out.println("Amount "+amount);
    }
}
