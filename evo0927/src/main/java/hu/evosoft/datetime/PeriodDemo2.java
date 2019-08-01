package hu.evosoft.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo2 {

	public static void main(String[] args) {
		
		
		Period p1  = Period.of(1, 13, 20);
		
		System.out.println("p1: "+p1);
		
		long years = p1.getYears();
		System.out.println("p1y: "+years);
		long month = p1.getMonths();
		System.out.println("p1m: "+month);
		long days = p1.getDays();
		System.out.println("p1d: "+days);
		
		days = p1.get(ChronoUnit.DAYS);
		System.out.println("p1d: "+days);
		
		System.out.println("------------------------------");
		
		Period p2 = Period.parse("P1Y13M20D");
		
		years = p2.getYears();
		System.out.println("p2y: "+years);
		month = p2.getMonths();
		System.out.println("p2m: "+month);
		days = p2.getDays();
		System.out.println("p2d: "+days);
		
		System.out.println("------------------------------");
			
		
		LocalDate d1 = LocalDate.of(2019, 8, 1);
		LocalDate d2 = LocalDate.of(2019, 12, 31);
		Period p3 = Period.between(d1, d2);
		
		System.out.println("p3: "+p3);
		
		p3 = Period.between(d2, d1);
		System.out.println("p3desc: "+p3);
		
		System.out.println("------------------------------");
		
		
		Period p4 = Period.ofMonths(30);
		
		System.out.println("p4: "+p4);
		
		p4 = p4.normalized();
		
		System.out.println("p4n: "+p4);
		
		System.out.println("------------------------------");
		
		LocalDate d3 = LocalDate.of(2019, 8, 1);
		
		d3 = d3.plus(Period.ofDays(7));
		
		System.out.println("d3: "+d3);
		
		System.out.println("------------------------------");
		
		
		Period p5 = Period.ofDays(30);
		
		p5 = p5.plus(Period.ofDays(31));
		
		System.out.println("p5: "+p5);
		
		System.out.println("------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
