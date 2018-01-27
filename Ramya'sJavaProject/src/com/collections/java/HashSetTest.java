package com.collections.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> ts= new HashSet();
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
