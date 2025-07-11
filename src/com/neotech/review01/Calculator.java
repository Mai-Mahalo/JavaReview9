package com.neotech.review01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Task until 2:33
		// Ask the user to enter 2 numbers
		// Ask the user for the operator (+,-,*,/)
		// Calculate the result using if-else
		
		Scanner fatma = new Scanner (System.in);
		
		System.out.println("Plese enter the first number:");
		double d1 = fatma.nextDouble();
		
		System.out.println("Please enter the second number");
		double d2 = fatma.nextDouble();
	
		System.out.println("Please enter the operator (+, -, *, /)");
		String operator = fatma.next();
		
		// System.out.printIn (d1 + " " + d2 + " " + operator);
		
		if (operator.equals("+")) {
			System.out.println("The result is " + (d1 + d2));
		}   else if (operator.equals("*")) {
			System.out.println("The result is"  + (d1 - d2));
		}	else if (operator.equals("/")) {
			System.out.println("The result is " + (d1 / d2));
			
			}
		}
		
		
	{

	}

}
