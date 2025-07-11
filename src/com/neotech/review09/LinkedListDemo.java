package com.neotech.review09;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Part 3-3 (26:00) & 4-1

// Why do they find the duplicates using ".contains"? "Japan" "India"
// Line 37

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> asia = new LinkedList<>();

		asia.add("India");
		asia.add("Japan");
		asia.add("China");
		asia.add("Turkiye");
		asia.add("India");
		asia.add(1, "Japan");
		
		System.out.println("asia -> " + asia);
		
		//Remove duplicates in the asia list
			// lets start with an empty list
			// add items one by one (check if it is already in the list or not)
		
		List<String> asia2 = new LinkedList<>();
		
		for (String country : asia)
		{
			if (asia2.contains(country)) //.contains = true or false
			{
				System.out.println(country + " already exists in the list!");
			}
			else
			{
				asia2.add(country);
			}
		}
		
		System.out.println("asia2 -> " + asia2);
		
		System.out.println("Doing the same thing with an iterator");
		
		List<String> asia3 = new LinkedList<>();
		Iterator<String> it = asia.iterator();
		
		while(it.hasNext())	
		{
			String country = it.next();
			
			//add the country to the new list, if it is not already there
			if (!asia3.contains(country))
			{
				asia3.add(country);
			}
		}
		
		System.out.println("asia3 -> " + asia3);
	}

}