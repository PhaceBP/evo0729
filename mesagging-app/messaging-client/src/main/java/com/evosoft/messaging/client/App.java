package com.evosoft.messaging.client;

import java.util.ServiceLoader;

import com.evosoft.messaging.MessagingService;

public class App {

	
	public static void main(String[]args) {
		
		Iterable<MessagingService> services = ServiceLoader.load(MessagingService.class);

		services.forEach(System.out::println);

		services.forEach(s -> s.onMessage("Hello World!"));
		
		
	}
}
