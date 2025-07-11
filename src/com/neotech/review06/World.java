package com.neotech.review06;

public class World {

	// part 4-2	& 5-1 (need to complete)
	
	public static void main(String[] args) {
		
		// 1st way using the constructor with NO parameters
		Person p1 = new Person();
		
		p1.name = "Nadim";
		p1.age = 32;
		p1.weight = 165;
		
		// private
		// p1.gender = "M";
		p1.displayInfo();
		
		System.out.println("---------------------------");
		
		// 2nd way, using the constructor with TWO parameters
		Person p2 = new Person("Sarosh", 21);
		p2.displayInfo();
		
		p2.weight = 100;
		p2.displayInfo();
		
		System.out.println("---------------------------");
		
		// 3rd way, using the constructor with THREE parameters
		
		
		

	}

}
