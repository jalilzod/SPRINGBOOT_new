package com.jalilzod_art.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		org.springframework.context.ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		NotificationManager notificationManager = context.getBean(NotificationManager.class);
		notificationManager.sendNot("Hi its me wanna hang out??");
	}

}
