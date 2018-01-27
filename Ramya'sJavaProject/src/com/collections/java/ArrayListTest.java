package com.collections.java;

import java.util.ArrayList;

public class ArrayListTest 
{
	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		al.add("Ramya");
		al.add(new Integer(10));
		al.add(new Double(5.5));
		al.add("Suresh");
		al.remove(1);
		for(int i=0;i<al.size();i++)
		{
		  System.out.println(al.get(i));
		}
		System.out.println("-----------------------");
		
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("Amzad"); 
		list.add("Arshad"); 
		list.add("Afsar"); 
		list.add(1,"Ramya");
		for (String name : list) 
		{ 
			System.out.println(name); 		
		}

	}
}
