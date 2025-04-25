package com.jalilzod_art.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class PayPallPaymentService implements PaymentService{

    public void processPayment(double amount){
        System.out.println("PayPall...");
        System.out.println("Amount: "+amount);
    }


}
