package com.ramya.java;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
	 int n,r,sum=0,temp;
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter Number");
	 n=scan.nextInt();
	 temp=n;
	 scan.close();
	 while(n>0)
	 {
		 r=n%10;
		 sum=(sum*10)+r;
		 n=n/10;
	 }
	 if(temp==sum)
		 System.out.println("It is  Palindrome Number");
	 else
		 System.out.println("Not a Palindrome Number");
	}

}
