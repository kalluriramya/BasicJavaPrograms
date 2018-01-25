package com.util.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample2 {

	public static void main(String[] args) {
		Date date = new Date(); 
		System.out.println("Default Date Value: " + date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE-MMMM-dd-yyyy"); 
		System.out.println("Formatted Date Value: " + dateFormat.format(date)); 
	}

}
