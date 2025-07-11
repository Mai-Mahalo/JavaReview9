package com.neotech.review06;

// part 5-2 (6:00)

public class Student {
	
	// instance/object variables
	String name;
	int age;
	
	// static/class variables
	static String school;
	
	// Constructor
	public Student(String name, int age) {
		this.name = name; // To distinguish between the parameter and instance variable
		this.age = age; // To distinguish between the parameter and instance variable
		
	}
	
	public void displauStudentInfo() {
		System.out.println("My name is  -> " + this.name + 
				           " AND my age is -> " + this.age +
				           " AND my school is -> " + Student.school);	
	}
	
	public static void main(String[] args) {
		
		Student.school = "NeoTech";
		
		// CANNOT be used without an object
		// Student.name = "Anna";
		
		// We don't have the Default Constructor
		// Student s1 = new Student();
		
		Student s2 = new Student("Jennifer", 24);
		s2.displauStudentInfo();
		
		Student s3 = new Student("Berfin", 22);
		s3.displauStudentInfo();
		
	}
	
	

}
