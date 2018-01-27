package com.collections.java;

import java.util.Enumeration; 
import java.util.Hashtable;


public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(333, "Kalluri");
		ht.put(666, "Kola");
		ht.put(999, "Maddineni");
		ht.put(222,"Doppalapudi");
		ht.put(111, "Gorijala");
		System.out.println(ht);
	
		Enumeration<Integer> e=ht.keys();
		while(e.hasMoreElements())
		{
			Integer key=(Integer) e.nextElement();
			System.out.println(key + "=" +ht.get(key));
		}
	}

}
