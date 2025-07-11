package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {
	
	// Watch Review 3, Part 5

	public static void main(String[] args) {
	 
  // Ask the user: How many numbers do you want to store in the array?
  // Ask him to enter the numbers: Read numbers and enter them into the array
  // Print the numbers from the array
		
	Scanner input = new Scanner (System.in);
	
	System.out.println("How many numbers do you want to store in the array?");
	int size = input.nextInt();
	
	// Declaring Array
	int[]array = new int[size];
	
	// Read numbers and enter them into the array
	for (int i = 0; i <= size; i++) {
		System.out.println("Please enter a number.");
		
		array[i] = input.nextInt();
		
	}
	
	// Print the numbers from the array
	System.out.println("Let's print the numbers from array");
	
	for(int i = 0; i < array.length; i++) {
		System.out.println(array[i] + ".");
	}
	System.out.println();
	
	System.out.println("Let's print the numbers using enhanced for loop");
	for (int num : array) {
		System.out.println(num + " ");
	}
	
	System.out.println();
	
	input.close();

	}
	
	// Homework-Practice
	// Print the sum of the numbers in the array
	// 1. Using Normal for loop
	// 2. Using Enhanced/advanced or loop

}
