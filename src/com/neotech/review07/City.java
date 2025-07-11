package com.neotech.review07;

// Part 2-1
// Only one public class in a file
// The name of the public class should match the name of the file

public class City {
	
	public static void main(String[] args) {
		
		City c1 = new City();
		Country c2 = new Country();
		Continent c3 = new Continent();
		
		
		// private variables and methods can be accessed only within the class
		//System.out.println(c3.name);
		
	}

}

class Country {
	
}

class Continent {
	private String name = "Europe";
	
}