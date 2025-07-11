package com.neotech.review07;

// Part 1-1

public class Doctor {
	
/* OOP -> Object Oriented Programming
 * 
 * 1. Inheritance (Trashegimi, Herencia, Miras, Nasledstvo, Meros, 
 *    Jicheng, Spadshuna, Viraasat, Erfenis, Eredita) 
 * 2. Polymorphism
 * 3. Abstraction
 * 4. Encapsulation
 * 
 *  Every class in Java extends the Object class
 *  Object class is like Adam in humanity
 */
	
	String name;
	int salary;
	String licenceId;
	
	// It is a good practice to declare the default constructor (no parameters)
	
	Doctor(){
		
	}
	
	Doctor(String name, int salary, String licenceId){
		this.name = name;
		this.salary = salary;
		this.licenceId = licenceId;	
	}
	
	public void checkUp (String name) {
		System.out.println("Doctor " + this.name + " make a checkup on " + name);
	}
}


	
	


