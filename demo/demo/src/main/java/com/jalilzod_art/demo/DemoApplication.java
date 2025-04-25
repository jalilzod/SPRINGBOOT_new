package com.jalilzod_art.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder(100);
		orderService.destroy();
	}

}
