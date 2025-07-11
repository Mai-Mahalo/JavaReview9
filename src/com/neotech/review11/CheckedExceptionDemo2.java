package com.neotech.review11;

//Part 4-3 (22:00)

public class CheckedExceptionDemo2 {

	public static void main(String[] args)  {
		
		System.out.println("Hi Java");
		
		try {
			Thread.sleep(5000); // waiting for 5000ms = 5sec
		} catch (InterruptedException e) {
			System.out.println("Something went wrong while waiting");
		} 
		// checked exception
		
		System.out.println("Bye Java");

	}

}
