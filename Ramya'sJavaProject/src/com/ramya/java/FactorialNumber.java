package com.ramya.java;

import java.util.Scanner;

public class FactorialNumber 
{
	public static void main(String[] args) 
	{
		int i,n,fact=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Number");
		n=scan.nextInt();
		scan.close();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Its Factorial number is: " +fact);
	}
}
