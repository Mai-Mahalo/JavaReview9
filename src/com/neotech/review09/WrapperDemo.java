package com.neotech.review09;

// Part 2-1 

public class WrapperDemo {

	public static void main(String[] args) {
		
		int num1 = 25;
		
//		Integer integer1 = new Integer(20); // until Java 1.8
//		Integer integer2 = Integer.valueOf(20); // Java 9 and up
		
		Integer integer1 = Integer.valueOf(num1); // boxing/Wrapping
		int num2 = integer1.intValue(); //Unboxing/UnWrapping
		
		// easiest way
		int num3 = 15;
		Integer integer3 = num3; // Auto-Boxing/Auto-Wrapping
		int num4 = integer3; // Auto-UnBoxing
		
		double d1 = 7.5;
		Double d2 = d1; //auto boxing
		
		// the long way (not auto) would be:
		Double d3 = new Double(8.5);
		Double d4 = 8.5; //Auto-Boxing (simpler)
		
		double d5 = d4; //Auto-Unboxing
		
		//Object = primitive ---> Auto Boxing
		//primitive = Object ---> Auto Unboxing
		
		boolean b1 = true; // primitive
		Boolean b2 = false; // class/object, I am assigning a primitive type
		
		Character c = '%'; // Auto-Boxing
		
		/*
		 * int ---> Integer
		 * byte --> Byte
		 * short --> Short
		 * long --> Long
		 * float --> Float
		 * double -> Double
		 * char --> Character
		 */
		
	}

}
