package hu.evosoft.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationDemo {

	public static void main(String[] args) {

		Duration d1 = Duration.ofHours(2);

		System.out.println(d1);

		/////////////////////////////////////

		LocalDateTime t1 = LocalDateTime.of(2019, 8, 1, 16, 0, 0);
		LocalDateTime t2 = LocalDateTime.of(2019, 8, 1, 18, 0, 0);

		Duration d2 = Duration.between(t1, t2);

		System.out.println(d2);

		d2 = Duration.between(t2, t1);

		System.out.println(d2);

		/////////////////////////////////////

		Duration d3 = Duration.parse("PT2H");

		System.out.println(d3);

		/////////////////////////////////////
		LocalDateTime t3 = LocalDateTime.of(2019, 8, 1, 16, 0, 0);
		t3 = t3.plus(Duration.ofHours(2));

		System.out.println(t3);

		/////////////////////////////////////

		Duration d4 = Duration.parse("PT2H");

		d4 = d4.plus(Duration.ofMinutes(15));

		System.out.println(d4);

		d4 = d4.minus(Duration.ofMinutes(1));

		System.out.println(d4);

		/////////////////////////////////////

		Duration d5 = Duration.parse("PT250M");

		System.out.println(d5);
	}
}
