package hu.evosoft.datetime;

import java.nio.channels.SeekableByteChannel;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class InstantDemo {

	public static void main(String[] args) {

		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		
		zones.stream().sorted().forEach(System.out::println);
		
		// Get the current time
		Instant instant = Instant.now();
		ZonedDateTime zd = instant.atZone(ZoneId.of("US/Alaska"));
		
		// Output format is ISO-8601
		System.out.println("DD: "+ zd);
		

		// Create from a String
		instant = Instant.parse("1995-10-23T10:12:35Z");
		
		System.out.println(instant);
		
		///////////////////////////////////////////////////////
		
		instant = Instant.now();
		instant.plus(Duration.ofHours(5).plusMinutes(4));
		
		System.out.println(instant);
		

	}

}
