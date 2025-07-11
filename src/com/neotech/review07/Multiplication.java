package com.neotech.review07;

//Part 3-1 (14:00, Better to watch again, Need to complete the code)

// Method overloading: The name of the method MUST be the same = "multiply"
// "int result" = local variables

// Access Modifier is NOT part of Method Signature
// Return type is NOT part of Method Signature
// static keyword is NOT part of Method Signature

public class Multiplication {
	
	public static void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
	}
	
	/* Is it method overloading if this method is not static? YES
	 * Is it method overloading if this method is private? YES
	 */
	private static void multiply(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		System.out.println(result);
	}
	
	public static void multiply (double d1, double d2) {
		double result = d1 * d2;
		System.out.println(result);
	}
	
	public static int multiply (int[] numbers) {
		int result = 1;
		
		for (int num : numbers) {
			result *= num;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Multiplication.multiply(3,4); 
		// We don't need to specify the class name coz "Multiplcation" is the same class.
		
		// Compile time polymorphism 
		// = We know which method we use before executing Eg: multiply (5.5, 2.0)
		// Static binding
		// Method Overloading
		multiply (2, 5, 3);
		multiply (5.5, 2.0);
		
		// Also invoke/execute method with 2 doubles
		// 2 will be casted to 2.0
		multiply (2, 4.0);
		
		int[]array = {2,5,3,4};
		
		int result = multiply(array);
		System.out.println("Array multiplication reesult -> " + result);
	}
	

	
	

	
	
}
