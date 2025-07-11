package com.neotech.review11;

// Part 3-1 (20:00)

public class ExceptionDemo {

	public static void main(String[] args) {
		divide(8, 4);
		divide(5, 0);
		divide(10, 3); // Will be an error because line 9 has an issue
	}
	
	public static void divide (int num1, int num2) {
		
		try {
		int result = num1/num2;
		System.out.println("The result is -> " + result);
		} catch(Exception ex) {
			
			// Write the problem/exception into a file
			// Or, print a meaningful message on the consule
			System.out.println("Problem when dividing -> " + num1 + " by " + num2);
			
			// System.out.println("Exception -> " + ex);
			// System.out.println("Exception Message -> " + ex.getMessage());
			// ex.printStackTrace();
			
		} finally {
			System.out.println("NeoTech is the best!");
	
		}
		//run-time exception = Error will be shown after run the code.
		
	}

}
