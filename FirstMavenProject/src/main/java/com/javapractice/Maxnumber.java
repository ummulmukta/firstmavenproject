package com.javapractice;

public class Maxnumber {

	public static void main(String[] args) {
int []x= {4,-4,5,6,-365,8,7,9};
int max=0;
for(int i=0;i<x.length;i++) {
	if(x[i]<max) {
		max=x[i];
	}
	
}
System.out.println(max);
	}

}
