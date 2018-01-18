package com.ramya.java;

import java.util.Scanner;

public class RecursiveFactorial 
{
	static int Factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return (n*Factorial(n-1));
	}
	public static void main(String[] args) 
	{
		int n,Fact;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		n=scan.nextInt();
		scan.close();
		Fact=Factorial(n);
		System.out.println("Its Factorial is: " +Fact);
	}
	

}
