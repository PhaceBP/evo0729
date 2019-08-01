package hu.evosoft.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateOfBirth {

	private LocalDate birthDay;

	DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

	public DateOfBirth(String dateOfBirth) {

		this.birthDay = LocalDate.parse(dateOfBirth, formatter);
	}

	public DateOfBirth(LocalDate date) {
		this.birthDay = date;
	}

	public long howManyDaysWereFromYourBirthDay() {

		LocalDate current = LocalDate.now();

		System.out.println("Current date: " + current);
		System.out.println("Birth date: " + birthDay);

		ChronoUnit.DAYS.between(birthDay, current);

		return Duration.between(birthDay.atStartOfDay(), current.atStartOfDay()).toDays();
	}

	public String getBirthDayAsString() {
		return formatter.format(birthDay);
	}

	public static void main(String[] args) {

		DateOfBirth d = new DateOfBirth(LocalDate.of(1986, 12, 21));

		System.out.println(d.howManyDaysWereFromYourBirthDay());
		System.out.println(d.getBirthDayAsString());

		d = new DateOfBirth("2013-11-13");

		System.out.println(d.howManyDaysWereFromYourBirthDay());
		System.out.println(d.getBirthDayAsString());
	}
}
