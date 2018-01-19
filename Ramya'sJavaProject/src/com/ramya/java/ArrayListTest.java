package com.ramya.java;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Hello");
		al.add(new Integer(100));
		al.add(new Double(200.0));
		al.add(1,"Ramya");
		
		System.out.println("Retreiveing the arraylist elemnts");;
		for(int i=0;i<al.size();i++)
		{
			System.out.println("Element" + i + " = " +al.get(i));
		}

	}

}
