package com.jalilzod_art.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig {

    @Value("${stripe.enabled}")
    private boolean isStripeEnabled;

    @Value("${payment-gateway}")
    private String paymentGateway;
    @Bean
    public PaymentService paypal(){
        return new PayPallPaymentService();
    }

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public OrderService orderService(){
        return paymentGateway.equals("stripe")?
                new OrderService(stripe()): new OrderService(paypal());

    }

}
