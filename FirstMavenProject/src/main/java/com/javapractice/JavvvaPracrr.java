package com.javapractice;

public class JavvvaPracrr {

	
	public static void main(String[] args) {
		String v= "abc cv bhg nh abc";
		String[] s=v.split("\\s");
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					System.out.println(s[i]);
				}
			}
		}
	}

}
