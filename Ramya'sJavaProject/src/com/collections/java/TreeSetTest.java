package com.collections.java;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet();
		ts.add("Ramya");
		ts.add("Suresh");
		ts.add("Narmi");
		ts.add("Gorri");
		ts.add("Minnu");
		System.out.println(ts);
		System.out.println("Using Iterator, the contents of Tree set are: "); 
		
		Iterator<String> iterator= ts.iterator();
		while(iterator.hasNext())
		{
			String element = (String) iterator.next();
			System.out.println(element);
		}
	}

}
