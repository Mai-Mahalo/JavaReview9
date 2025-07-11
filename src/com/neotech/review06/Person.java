package com.neotech.review06;

// part 4-1 

public class Person {
	
	// instance variables
	String name;
	int age;
	int weight;
	// private char gender;
	
	public Person() { 
		// method name must be the same as the class name
		// we don't use "void".
		
	}
	
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
		
		
	} 
	
	public void displayInfo() {
		System.out.println("Name: " + name + " age: " + age + " weight: " + weight);
	}
	

}
