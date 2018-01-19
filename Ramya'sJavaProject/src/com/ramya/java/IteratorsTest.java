package com.ramya.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorsTest {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("e");
		al.add("r");
		al.add("C");
		al.add("B");
		
		System.out.println("Original contents of al:");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			String element=itr.next();
			System.out.println(element + "");
		}
	
		ListIterator<String> litr=al.listIterator();  
		System.out.println("traversing elements in forward direction...");  
		while(litr.hasNext()){  
		System.out.println(litr.next());  
		}  
		System.out.println("traversing elements in backward direction...");  
		while(litr.hasPrevious()){  
		System.out.println(litr.previous());  
		}  
		
	}
	

}
