package com.jalilzod_art.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
@Primary
public class EmailNotificationService implements NotificationService{

    @Value("${mail-server.port}")
    String mailPort;

    @Value("${mail-server.host}")
    String mailHost;

    @Override
    public void send(String msg, String recipient) {
        System.out.println("Message "+msg+"\n"
        +"Recipient "+recipient);
        System.out.println("On Port: "+mailPort);
        System.out.println("On Host: "+mailHost);
    }
}
