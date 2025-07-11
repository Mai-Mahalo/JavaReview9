package com.neotech.review08_final;

//Part 3-5 (35:00)

// A final class cannot be subclassed
public class Student extends Person {
	
	String major;

	public Student(String name, String id, String major) {
		super(name, id);
		this.major = major;
		
	}
	
	@Override
	//overriding info() to include major
	public void info()
	{
		System.out.println("ID: " + id + "\nName: " + name + "\nMajor: " + major);
	}
	
	// Attempting to override a final method.
	// It will cause an Error
	
	// Attempting to override a final method.
	// It will cause an Error
	
/*	public void sayHello()
	{
		
	}

*/
	
	
	
}