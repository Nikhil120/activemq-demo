package com.example.demo.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@JmsListener(destination = "message-queue")
	public void listener(String message) {
		System.out.println("Message Received: " + message);
	}
}
