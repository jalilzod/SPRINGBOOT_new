package com.jalilzod_art.demo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SMSNotificationService implements NotificationService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS is sending notification service:\n"+msg);
    }
}
