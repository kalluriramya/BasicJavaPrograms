package com.collections.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorTest {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		// Add elements to the array list 
		al.add("C"); 
		al.add("A"); 
		al.add("E"); 
		al.add("B"); 
		al.add("D"); 
		al.add("F");
		// Use iterator to display contents of al 
		System.out.print("Original contents of al: "); 
		Iterator<String> itr = al.iterator(); 
		while(itr.hasNext()) 
		{ 
			String element = itr.next(); 
			System.out.print(element + " "); 
		} 
		System.out.println();
		// Modify objects being iterated 
		ListIterator<String> litr = al.listIterator(); 
		while(litr.hasNext()) 
		{ 
			String element = litr.next(); 
			litr.set(element + "+"); 
		}
		System.out.print("Modified contents of al: "); 
		itr = al.iterator(); 
		while(itr.hasNext()) 
		{ 
			String element = itr.next(); 
			System.out.print(element + " "); 
		} 
		System.out.println();
		System.out.println("Elements in Backward direction: ");
		while(litr.hasPrevious())
		{
			String element=litr.previous();
			System.out.println(element + " ");
		}
		System.out.println();

	}

}
