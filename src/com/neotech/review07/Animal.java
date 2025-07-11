package com.neotech.review07;

//Part 2-2 

// Base/Super/Parent class
public class Animal {
	String name;
	int legs;

	Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public void sleep() {  // method
		System.out.println("All animals sleep");
	}

	public void displayInfo() { // method
		System.out.println(name + " has " + legs + " legs");
	}

}
//Derived/Sub/Child class
class Wolf extends Animal {

	Wolf(String name, int legs) {
		super(name, legs);
	}
	
}
//Task until 1:25
//Create 3 classes inheriting Animal class
//Wolf, Fox, Bear
//Wolf does not have any extra variables or methods
//Fox has a String furColor
//Bear has a roar() method
//Create a class Forest where you create 1 animal from each type (with all of their information)

class Fox extends Animal{
	String furColor;
	
	Fox(String name, int legs, String furColor){
		super(name, legs);
		this.furColor = furColor;
	}
	
}

class Bear extends Animal {
	
	Bear (String name, int legs) {
		super (name, legs);		
	}
	
	public void roar () {
		System.out.println("All bears roar");
	
	}
	
}
	

	

	

	


