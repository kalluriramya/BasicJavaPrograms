package com.util.java;

import java.util.Date;

public class DateExample1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Date: " + date.getDate()); 
		System.out.println("Month: " + (date.getMonth() + 1));
		System.out.println("Year: " + (date.getYear() + 1900)); 
		System.out.println("Time: " + date.getTime()); 

	}

}
