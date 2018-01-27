package com.collections.java;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, String> m=new TreeMap<String, String>();
		m.put("Ramya", "Kalluri");
		m.put("Narmada", "Kola");
		m.put("Suresh", "Maddineni");
		m.put("Madhu", "Maddineni");
		m.put("Niharika","Doppalapudi");
		m.put("Charitha", "Gorijala");
		System.out.println(m);
		
		Iterator<String> iterator=m.keySet().iterator();
		while(iterator.hasNext())
		{
			String key= (String)iterator.next();
			System.out.println(key + "=" +m.get(key));
		}
	}

}
