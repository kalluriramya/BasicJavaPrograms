package com.ramya.java;

import java.util.LinkedList;

public class LinkedListTest 
{

	public static void main(String[] args) 
	{
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("Amzad");
		linkedlist.add("Ramya");
		linkedlist.add("Suresh");
		linkedlist.add("Niha");
		System.out.println("Linked list contacts: " +linkedlist);
		
		
		// Add First and Last Element //
		linkedlist.addFirst("Amzad");
		linkedlist.addLast("Basha");
		System.out.println("LinkedList Content after addition: " + linkedlist);
		
		// This is how to get and set Values //
		Object firstvar = linkedlist.get(0);
		System.out.println("First element: " + firstvar);
		linkedlist.set(0, "Amzad Basha");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("First element after update by set method: " + firstvar2);
		
		
		// Remove first and last element //
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("LinkedList after deletion of first and last element: " + linkedlist);
		
		
		// Add to a Position and remove from a position//
		linkedlist.add(0, "Syed");
		linkedlist.remove(2);
		System.out.println("Final Content: " + linkedlist);
	}

}
