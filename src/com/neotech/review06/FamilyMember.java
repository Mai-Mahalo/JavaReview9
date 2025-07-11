package com.neotech.review06;

// Part 1-1 (better to watch for review)

public class FamilyMember {
	
	String firstName; // instance variable, belongs to the instance/object
	static String lastName; // static/class variable, belong to the class
	int age; // insntance variable (because NOT saying "static")
	
	// With non-static methods you can access ALL the variables
	void printFullname() {
		System.out.println("Full name is: " + firstName + " " + lastName);
		
	}
	
	// With static methods you can access ONLY static variables
	static void printFamilyName() {
		System.out.println("Family name is: " + lastName);
		
	}
	

}
