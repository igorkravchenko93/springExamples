package com.kravchenko.service;

import org.springframework.stereotype.Component;

@Component
public class RabbitMessagesReceiver {

    private int count = 0;

    public void receiveMessage(String message) {
        count++;
        if (count % 100000 == 0) {
            System.out.println("Count: " + count + " Received <" + message + ">");
        }


    }
}
