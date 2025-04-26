package com.jalilzod_art.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {
    @Value("mail-server.port")
    private String port;

    @Value("mail-server.host")
    private String host;

    @Override
    public void send(String message, String recipient) {
        System.out.println("Message : " + message+" Recipient "+recipient);
        System.out.println("Host : " + host);
        System.out.println("Port : " + port);
    }
}
