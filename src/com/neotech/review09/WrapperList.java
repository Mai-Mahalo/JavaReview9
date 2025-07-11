package com.neotech.review09;

import java.util.ArrayList;
import java.util.Iterator;

//Part 2-2 (16:00)

public class WrapperList {

	public static void main(String[] args) {
		
		// ArrayList can store only Objects/Classes
		
		// we cannot use it (or any primitive type)
		// ArrayList<int> numbers = new ArrayList<>();
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		boolean isEmpty = numbers.isEmpty();
		System.out.println("Is it empty? " + isEmpty);
		System.out.println("The size is -> " + numbers.size());
		
		numbers.add(Integer.valueOf(5)); // adding on INTEGER object - long way
		numbers.add(10); // this is automatically converting 10 to Integer
		numbers.add(1);
		numbers.add(1, 15);
		
		System.out.println(numbers);
		
		System.out.println("The size is -> " + numbers.size());
		
		System.out.println("---------------------------");
		
		boolean contains = numbers.contains(8);
		System.out.println("Does the list contain number 8? " + contains);
		
		// removing by index:
		Integer removedElement = numbers.remove(1); // removes the element at index 1
		System.out.println("The removed element: " + removedElement);
		System.out.println(numbers);
		
		//removing by object
		//numbers.remove(new Integer(1));
		
		numbers.remove(Integer.valueOf(1));
		System.out.println(numbers);
		
		System.out.println("---------------------");
		
		System.out.println("How can we iterate on the ArrayList?");
		
		System.out.println("1st Way: indexed for loop");
		
		for (int i = 0; i < numbers.size(); i++)
		{
			int element = numbers.get(i);
			System.out.println(element);
		}
		
		System.out.println("2nd way: enhanced for loop");
		
		for (int element : numbers)
		{
			System.out.println(element);
		}
		
		System.out.println("3rd way: using the iterator");
		
		Iterator<Integer> it = numbers.iterator();
		
		/*
		 * There are only 3 methods in the Iterator!!!!
		 * 1. hasNext() ---> it will return true/false if there is a next element
		 * 2. next() ---> it will return the next element on the collection (and move the pointer to the next)
		 * 3. remove() ---> this will remove the current element from the collection
 		 */
		
		while(it.hasNext()) // as long as I have a next element
		{
			int element = it.next();
			System.out.println(element);
		}
		
		
		


	}

}
