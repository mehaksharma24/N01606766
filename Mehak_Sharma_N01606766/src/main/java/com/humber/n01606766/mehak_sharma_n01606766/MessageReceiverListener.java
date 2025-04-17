package com.humber.n01606766.mehak_sharma_n01606766;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiverListener {

    @JmsListener(destination = "lab-queue")
    public void receiveMessage(MessageParser parser) {
        System.out.println("Received structured message in listener:");
        System.out.println("Name: " + parser.getName());
        System.out.println("Message: " + parser.getMessage());
    }
}
