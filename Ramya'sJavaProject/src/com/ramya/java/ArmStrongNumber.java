package com.ramya.java;

import java.util.Scanner;

public class ArmStrongNumber 
{
	public static void main(String[] args)
	{
		int n,r,result=0,temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		n=scan.nextInt();
		temp=n;
		scan.close();
		while(n>0)
		{
			r=n%10;
			n=n/10;
			result=result+(r*r*r);
		}
		if(temp==result)
		{
			System.out.println("It is Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}
}
