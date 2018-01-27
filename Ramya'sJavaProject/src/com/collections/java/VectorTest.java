package com.collections.java;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		v.addElement("Ramya");
		v.addElement("Niharika");
		v.addElement("Narmi");
		v.addElement("Gorri");
		v.addElement("Minnu");
		System.out.println(v);
		
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
		{
			String element=(String)e.nextElement();
			System.out.println(element);
		}
		System.out.println("---------------------");

		System.out.println("Before while, Vector size: " + v.size()); 
		Iterator<String> i = v.iterator(); 
		while (i.hasNext()) 
		{ 
			String element = i.next(); 
			System.out.println(element); 
			i.remove(); 
		} 
		System.out.println("After while, Vector size: " + v.size());

	}

}
