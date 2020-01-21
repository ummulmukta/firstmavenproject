package com.javapractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionZipCode {

	public static void main(String[] args) {
	String name="545 678 8899 11-373 sdcvfgvvcffv";
	
	
	String pattern="\\d{2}-\\d{3}";
	Pattern p=Pattern.compile(pattern);
	Matcher m=p.matcher(name);
	while(m.find()) {
		System.out.println(m.group().trim());
	}

	}

}
