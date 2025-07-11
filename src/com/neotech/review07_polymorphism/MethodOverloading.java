package com.neotech.review07_polymorphism;

// Part 4-1

public class MethodOverloading {
	
	// Method signature = method name + parameters
	// Access modifier is NOT part of the Method signature
	// Return type is NOT part of the Method signature
	// Static or non-static is NOT part of the Method signature
	
	public void calculateInterest() {
		
	}
	
	public void calculateInterest (int a) {
		
	}
	
	public void calculateInterest (String a) {
		
	}
	
	public void calculateInterest (int a, int b) {
		
	}
	
	public void calculateInterest (double a, double b) {
		
	}
	
	public void calculateInterest (double a, int b) {
		
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		
		mo.calculateInterest("Aicha");
		mo.calculateInterest(4.5, 10);
		
		// Polymorphism
		// Method Overloading
		// Compile time Polymorphism/early binding/static binding
	}
	

}
