package com.jalilzod_art.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		UserService userService = context.getBean(UserService.class);
		userService.registerUser(new User(1l,"jalilzod_art","jalilzod_art@gmail.com","4433"));
		userService.registerUser(new User(1l,"jalilzod_art","mingyuan@gmail.com","4433"));

	}

}
