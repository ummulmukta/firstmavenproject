package com.javapractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpressin {

	public static void main(String[] args) {
		String name="646-519-0528 Ummul ummulomukta@gmail.com Ummul 11373";
//find zip code
		
		String zipPattern="\\d{3}-\\d{3}-\\d{4}";
	
		Pattern p=Pattern.compile(zipPattern);
		Matcher m=p.matcher(name);
		while(m.find()) {
			//if(m.group().length()!=0) {
				
			System.out.println(m.group().trim());
		}
			//else {
				//System.out.println("No matches");
			//}
			//}
		
	}

}
