package com.evosoft.javasetraining.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

	public static int runTest(String regex, String text) {
		return runTest(regex, text, 0);
	}

	public static int runTest(String regex, String text, int flags) {
		Pattern pattern = Pattern.compile(regex, flags);
		Matcher matcher = pattern.matcher(text);
		int matches = 0;
		while (matcher.find()) {
			matches++;
			String value = matcher.group();
			System.out.println("Found: "+value+" number: "+matches + " at "+matcher.start() + "-"+matcher.end());
		}
		return matches;
	}
}
