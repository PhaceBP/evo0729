package hu.evosoft.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime localDateTimeBeforeDST = LocalDateTime
				  .of(2018, 3, 25, 1, 55);
				  
		System.out.println(localDateTimeBeforeDST.toString());
		
		
		ZoneId italianZoneId = ZoneId.of("Europe/Rome");
		ZonedDateTime zonedDateTimeBeforeDST = localDateTimeBeforeDST
		  .atZone(italianZoneId);
		  
		
		System.out.println(zonedDateTimeBeforeDST.toString());
		
		ZonedDateTime zonedDateTimeAfterDST = zonedDateTimeBeforeDST
				  .plus(10, ChronoUnit.MINUTES);
				  
		System.out.println(zonedDateTimeAfterDST.toString());
		
		Long deltaBetweenDatesInMinutes = ChronoUnit.MINUTES
				  .between(zonedDateTimeBeforeDST,zonedDateTimeAfterDST);
		System.out.println(deltaBetweenDatesInMinutes);
		
		
	}

}
