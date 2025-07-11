package com.neotech.review08_abstraction;

//Part 1-4

public class World {

	public static void main(String[] args) {
		
	// We cannnot create an object of a an abstract class!!!
	// Human h1 = new Human ("Nadim");
		
	//up-casting (or down-castng) can be ONLY done because of INHERITANCE
	Human a1 = new Albanian("Irena");
	
	a1.talk();
	a1.sleep();
	// a1.albanianDance(); // No, because the Albanian object is assigned to a Human
	// and the Human class cannot see albanianDance(), I cannot access it.
	
    Human t1 = new Turkish("Burak");
    
    t1.talk();
    t1.sleep();
    // t1.makebaklava();
	
	
	

	}

}
