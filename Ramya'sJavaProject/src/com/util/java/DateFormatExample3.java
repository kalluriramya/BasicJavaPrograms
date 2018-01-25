package com.util.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatExample3 {

	public static void main(String[] args) {
		// Get the default MEDIUM/SHORT DateFormat 
		DateFormat format = DateFormat.getDateTimeInstance (DateFormat.MEDIUM, DateFormat.SHORT);
		// Read and parse input, stopping on a blank input line 
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		try 
		{ 
			System.out.print("Enter Date String [Ex � Nov 23, 1976 5:14 PM]:"); 
			String dateString = reader.readLine();
		
		// Parse the date 
			try 
			{ 
				Date date = format.parse(dateString); 
				System.out.println("Original string: " + dateString); 
				System.out.println("Parsed date    : " + date.toString()); 
	
			} 
			catch(ParseException pe) 
			{ 
				System.out.println ("ERROR: could not parse date in string \"" + dateString + "\""); 
			} 
		} 
		catch(IOException ioe) 
		{ 
			System.out.println("I/O Exception: " + ioe); 
		} 
	}

}
