package com.neotech.review09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Part 3-1

public class CollectionIntro {

	public static void main(String[] args) {
		
		// List is an Interface
		// ArrayList and LinkedList are 2 classes that implement the list the List interface
		
		List<String> africa1 = new ArrayList<>(); // Up-casting
		
		africa1.add("Nigeria");
		africa1.add("Ghana");
		africa1.add("Cameroon");
		africa1.add("Somalia");
		africa1.add(0, "Ethiopia");
		africa1.add("Ghana");
		
//		africa1.add(5); // compiler-time error -- Cannnot store integer
		
		System.out.println("africa1 -> " + africa1);
		
		// 2nd way of filling the ArrayList
		List<String> africa2 = new ArrayList<>(); // create empty arrayList
		//addAll method will get a Collection and add it to the current collection
		
		africa2.addAll(africa1);
		
		System.out.println("africa2 -> " + africa2);
		
		//3rd way of filling the ArrayList = constructor(?)
		List<String> africa3 = new ArrayList<>(africa1);
		System.out.println("africa3 -> " + africa3);
		
		System.out.println("----------------------");
		
		// there are 3 ways to iterate the list
		
		for (int i = 0; i < africa1.size(); i++)
		{
			String country = africa1.get(i);
			System.out.print(country + " ");
		}
		
		System.out.println();
		
		for (String country : africa1)
		{
			System.out.println(country + " ");
		}
		System.out.println();
		
		System.out.println("Using iterator: ");
		Iterator<String> it = africa1.iterator();
		
		while(it.hasNext())
		{
			String country = it.next();
			System.out.print(country + " ");
		}
		System.out.println();
		
	
		
		        

	}

}
