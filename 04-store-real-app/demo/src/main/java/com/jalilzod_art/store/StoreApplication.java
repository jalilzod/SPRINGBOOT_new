package com.jalilzod_art.store;

import com.jalilzod_art.store.entities.Address;
import com.jalilzod_art.store.entities.User;
import com.jalilzod_art.store.repositories.AddressRepository;
import com.jalilzod_art.store.repositories.UserRepository;
import com.jalilzod_art.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		UserService userService = context.getBean(UserService.class);

		userService.deleteUser();


	}

}
