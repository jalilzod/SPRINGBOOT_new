package com.jalilzod_art.demo;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService{


    @Override
    public void sendMessage(String msg) {
        System.out.println("Email is sending notifications:\n"+msg);
    }
}
