package com.jalilzod_art.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void sendNot(String msg){
        notificationService.sendMessage(msg);
    }

}
