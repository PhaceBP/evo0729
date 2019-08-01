package hu.evosoft.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {

	
	public static void main(String[]args) {
		
		Period p = Period.ofDays(5);
		System.out.println(p);
		
		long days = p.getDays();
		System.out.println(days);
		days = p.get(ChronoUnit.DAYS);
		System.out.println(days);
		
		////////////////////////////////////////
		
		Period p2 = Period.of(1, 2, 3);
		System.out.println(p2);
		
		////////////////////////////////////////
		
		String pattern = "P2Y3M";
		Period p3 = Period.parse(pattern);
		
		System.out.println(p3);
		
		////////////////////////////////////////
		
		LocalDate d1 = LocalDate.of(2019, 8, 1);
		LocalDate d2 = LocalDate.of(2020, 9, 1);
		
		Period p4 = Period.between(d1, d2);
		
		System.out.println(p4);
		
		p4 = Period.between(d2, d1);
		
		System.out.println(p4);
		
		////////////////////////////////////////
		
		Period p5 = Period.ofMonths(20);
		
		System.out.println(p5);
		
		p5 = Period.ofMonths(20).normalized();
		
		System.out.println(p5);
		
		////////////////////////////////////////
		
		LocalDate d3 = LocalDate.of(2019, 8, 1);
		Period p6 = Period.ofDays(3);
		
		d3 = d3.plus(p6);
		
		System.out.println(d3);
		
		////////////////////////////////////////
		
		Period p7 = Period.ofDays(3);
		
		p7 = p7.plus(Period.ofMonths(1));
		
		System.out.println(p7);
		
	}
}
