package com.ramya.java;
import java.util.Scanner;

public class PrimeNumbersRange 
{

 public static void main(String[] args) 
 {
	int n1,n2,i,j,count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter First number");
	n1=s.nextInt();
	System.out.println("enter second number");
	n2=s.nextInt();
	s.close();
	System.out.println("Prime numbers between given range are :");

	for(i=n1;i<=n2;i++)
	{
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
			 count=0;
			 break;
			}
			else
			{
			 count=1;
			}
		}
		if(count==1)
			System.out.println(+i);
	}

 }

}

