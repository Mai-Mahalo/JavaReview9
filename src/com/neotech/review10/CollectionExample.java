package com.neotech.review10;

import java.util.*;

//Part 2-2 

public class CollectionExample {
	
	// Collection Framework -- All interfaces and implementations
	// Collection Interface -- Only one interface
	// Collections class -- It is a helper/utility class
	
	public static void main(String[] args) {
		
		Set<Integer> numbers = new HashSet<>(); // up-casting
		
		numbers.add(65);
		numbers.add(19);
		numbers.add(82);
		numbers.add(70);
		numbers.add(91);
		numbers.add(23);
		
		System.out.println(numbers);
		
		Integer min = Collections.min(numbers);
		System.out.println("min -> " + min);
		
		System.out.println("max -> " + Collections.max(numbers));
		
		// SET cannot be sorted/ordered
		// Collections.sort(numbers);
		
		// LIST can be sorted/ordered
		List<Integer> numberList = new ArrayList<>(numbers);
		System.out.println("List before sorting -> " + numberList);
		
		Collections.sort(numberList);
		System.out.println("List after sorting -> " + numberList);
		
		System.out.println("--------------------------------");
		
		List<String> students = new LinkedList<String>();
		students.add("Javier");
		students.add("Berfin");
		students.add("Nadim");
		students.add("Alaric");
		students.add("Aicha");
		students.add("Gozde");
		System.out.println(students);
		
		String first = Collections.min(students);
		System.out.println("first -> " + first);
		System.out.println("last -> " + Collections.max(students));
		
		Collections.sort(students);
		System.out.println(students);
		
		System.out.println("--------------------------------");
		
		int[] arr = {9, 2, 6, 1, 8, 3};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
