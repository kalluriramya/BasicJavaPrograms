package com.ramya.java;

import java.util.Scanner;

public class PrimeNumberCheck 
{

	public static void main(String[] args) 
	{
		int i=2,n; 
		boolean flag=true;
		
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter number to check");
		n=scan.nextInt();
		scan.close();
		
		for(i=2;i<=n/2;i++)
		{
			if(n%2==0)
				flag=false;
		}
		if(flag)
			System.out.println("The number is prime number");
		else
		System.out.println("Not a prime Number");
	}

}              