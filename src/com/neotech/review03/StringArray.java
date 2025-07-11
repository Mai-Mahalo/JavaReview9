package com.neotech.review03;

//Review 03: Part 3-2

public class StringArray {

	public static void main(String[] args) {
		
	String[] animals = {"dog", "cat", "fish", "goat", "lion"};
	// The length/size is 5. Index is 0 to 4.
	
	for (int i = 0; i < animals.length; i++) {
		// if i < 4 (=elements) means they print index 0,1,2,3) 
		System.out.print(animals[i] + " ");
	}
	
	System.out.println();
	
	// Advanced/Enhanced for loop (Fancy for loop:)
	
	for (String elements : animals) {
		System.out.print(elements + " ");
		
	}
	
	System.out.println();
	System.out.println("--------------------------------");
	System.out.println("Let's print the animals in reverse order");
	System.out.println("--------------------------------");
	
	// The last element's index is -> (length - 1)
	for (int i = animals.length - 1; i >= 0; i--) {
		System.out.print(animals[i] + " ");
	}
	
	// Print the animals in reverse order using enhanced for loop
	// Not possible, until somebody creates it :)



	}

}
