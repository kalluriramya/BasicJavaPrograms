package com.ramya.java;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		int r,n,rev=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Number");
		n=scan.nextInt();
		scan.close();
		
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
			
		}
		System.out.println("the reverse of this number is: " +rev);
	
	
	}
}
