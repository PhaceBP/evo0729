package com.evosoft.modules.messaging.console;

import com.evosoft.messaging.MessagingService;

public class ConsoleMessagingService implements MessagingService {

	@Override
	public void onMessage(String message) {
		
		System.out.println("Message received: "+message);
		
	}

}
