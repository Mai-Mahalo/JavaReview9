package com.neotech.review01;

public class VariableDemo { //Class name needs to start from the capital letter.

	// ALWAYS FORMAT YOUR CODE
	// Command + Shift + f

	public static void main(String[] args) {
		
		// Declare a variable
		String firstName; 
		//"firstName" -> need to start from small letter!
		
		//System.out.println("My name is ---> " + firstName);
		
		// Assign a value (initialize)
		firstName = "Jennifer";
		System.out.println("My name is ---> " + firstName);
		
		// Declare a variable & Assign a value
		String lastName = "Bourdierd";
		
		int age = 26;

		System.out.println(firstName + " " + lastName + " " + age + 1);
		System.out.println(firstName + " " + lastName + " " + (age + 1));
		
		System.out.println(age);
		
		//After 3 years
		//re-assign a new value to  the container 
		age += 3; // = age = age +3
		lastName = "Pitt";
		
		
		
		
	}

}
