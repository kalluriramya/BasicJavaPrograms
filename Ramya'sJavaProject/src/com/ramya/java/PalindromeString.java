package com.ramya.java;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String str, rev="";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		str=scan.nextLine();
		scan.close();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("It is Palindrome String");
		else
			System.out.println("Not Palidrome String");
	}

}
