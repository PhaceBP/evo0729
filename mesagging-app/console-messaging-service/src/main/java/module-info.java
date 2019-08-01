/**
 * 
 */
/**
 * @author atbalog
 *
 */
module com.evosoft.modules.messaging.console {

	requires com.evosoft.modules.messaging;
	
	provides com.evosoft.messaging.MessagingService with com.evosoft.modules.messaging.console.ConsoleMessagingService;
}