package com.jalilzod_art.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		var userService = context.getBean(UserService.class);
		userService.registerNewUser(new User(1l,"mingyuan@qq.com","Ming","code98"));
		userService.registerNewUser(new User(2l,"yangming@qq.com","Yuan","code99"));

	}

}
