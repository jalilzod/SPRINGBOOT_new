package com.jalilzod_art.demo;


import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private NotificationService notificationService;
    public UserService(UserRepository userRepository,NotificationService notificationService){
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }


    public void registerNewUser(User user){

        if(userRepository.findByEmail(user.getEmail())!=null)
            throw new IllegalArgumentException("User with email"+user.getEmail()+"Already exist...");
        userRepository.saveUser(user);
        notificationService.send("You registered successfully",user.getEmail());
    }




}
