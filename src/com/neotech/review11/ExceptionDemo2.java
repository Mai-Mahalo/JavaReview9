package com.neotech.review11;

//Part 4-1 

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		try {
			for (int i = 0; i <= 3; i++) {
				numbers[i] = i;		
		} 
		
			System.out.println("Will this line be executed?"); // NO, because this is before "catch".
		} catch (Exception e) {
			// System.out.println(e);
			// System.out.println(e.getMessage());
			// e.printStackTrace();
			
			// Print a meaningful message
			System.out.println("Error: You are storing an element outside of the array!");
			
		}
		
		System.out.println("Continuebcode execution..."); // YES
		

	}

}
