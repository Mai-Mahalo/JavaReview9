package com.neotech.review06_outside;

//Part 2-3 

import com.neotech.review06.USA;

public class Mexico {

	public static void main(String[] args) {
		USA us = new USA (); // we need to import USA because USA is in different package.
		
		System.out.println("Accessing the variables from inside Mexico");
		
		System.out.println("public -> " + us.bestSchool);
		
		// private
//		System.out.println("default -> " + us.state);
//		System.out.println("protected -> " + us.mainState);
//		System.out.println("private -> " + us.capitalCity);
		
		System.out.println("---------------------------");
		
		System.out.println("Accessing the methods from inside Mexico");
		
		us.attendNeoTech();
		
		// private, protected & default methods CANNOT be accessed from Mexico
		// us.playNBA();
		// us. selectPresident();
		
		
		

	}

}
