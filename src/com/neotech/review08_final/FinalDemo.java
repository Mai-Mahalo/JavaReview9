package com.neotech.review08_final;

//Part 3-4 (31:00)

public class FinalDemo {
	
	// Final can not be reassigned.
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Sofia", "1234");
		
		p1.info();
		p1.sayHello();
		
//		p1.id = "12345"; // Error: cannot assign value to a final variable
		
		Student s2 = new Student("Sabah", "4567", "CS");
		s2.info();
		s2.sayHello(); // the inherited final method from Person
		
	}

}
