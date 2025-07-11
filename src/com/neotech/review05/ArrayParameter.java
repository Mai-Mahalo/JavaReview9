package com.neotech.review05;

import java.util.Arrays;

//part 5-2 
public class ArrayParameter {

	public static void main(String[] args) {
		int[] array = {3, 7, 4, 9, 1};
		
		// To print one element from the array, with index 1
		// System.out.println(array[1]); -> 7
		
		// System.out.println(array); -> It does not print properly.
		
		String str = Arrays.toString(array);
		System.out.println(str);
		
		ArrayParameter ap = new ArrayParameter();
		int result = ap.largestNumber(array);
		
		System.out.println("The largest number in the array is -> " + result);
		
		
// Review 06, Part 3-1 (better to watch again, Task)
		//Use this class to do the task

		// Break and Task until 1:05

		// Task2
		// Create a method that will get an array of integers,
		// and return the sum
		// Make the method protected

		// Task3
		// Create method that will get an array of integers,
		// and return the average as a double
		// Make the method private
		
		
		
	}
		// input --> int [] (an array of integers)
	    // logic --> given an array, find the largest number
	    // output  --> int (the largest number)
	    // visibility --> public (will learn next week)
	    // usage --> non-static (will learn next week)
		public int largestNumber (int[]arr) {
			int largest = arr[0]; 
			
			for (int el : arr) {
				if (el > largest) {
					largest = el;
				}
				
			}
			return largest;
			
		}

				
			}
			
		

	
	
	


