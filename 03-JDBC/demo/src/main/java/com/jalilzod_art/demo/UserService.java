package com.jalilzod_art.demo;


import org.springframework.stereotype.Service;

@Service
public class UserService {
    private NotificationService notificationService;
    private UserRepository userRepository;

    public UserService(NotificationService notificationService, UserRepository userRepository) {
        this.notificationService = notificationService;
        this.userRepository = userRepository;
    }

    public void  registerUser(User user) {

        if(userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("User with email " + user.getEmail() + " already exists");
        }
        userRepository.save(user);
        System.out.println("User registered successfully "+user.getEmail());
    }
}
