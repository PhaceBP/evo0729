package com.evosoft.javasetraining.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class RegexExample {

	@Test
	public void givenRegexForPhoneNumberValidation_whenMatches_thenCorrect() {

		Pattern p = Pattern.compile("^((\\+|00)(\\d{1,3})[\\s-]?(\\d{1,3})[\\s-]?)?(\\d{7,10})$");
		Matcher m = p.matcher("+36-20-3715979");
		if (m.matches()) {
			System.out.println("Country = " + m.group(3));
			System.out.println("Service Provider = " + m.group(4));
			System.out.println("Phone number = " + m.group(5));
		}
	}

	@Test
	public void givenRegexForHUIBANValidation_whenMatches_thenCorrect() {

		Pattern p = Pattern.compile("[a-zA-Z]{2}[0-9]{2}[a-zA-Z0-9]{0,30}");
		Matcher m = p.matcher("HU77121000111799795500000000");
		Assert.assertTrue(m.matches());
	}

	@Test
	public void givenRegexForFRIBANValidation_whenMatches_thenCorrect() {
		Pattern p = Pattern.compile("[a-zA-Z]{2}[0-9]{2}[a-zA-Z0-9]{0,30}");
		Matcher m = p.matcher("FR7630006000011234567890189");
		Assert.assertTrue(m.matches());
	}

	@Test
	public void givenRegexForEmailValidation_whenMatches_thenCorrect() {

		Pattern p = Pattern.compile("^(.{4,})@(.+)\\.hu$");
		Matcher m = p.matcher("alma@gmail.hu");

		if (m.matches()) {
			System.out.println("Email prefix = " + m.group(1));
			System.out.println("Service Provider = " + m.group(2));
		}

		Assert.assertTrue(m.matches());
	}
}
