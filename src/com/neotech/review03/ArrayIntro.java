package com.neotech.review03;

//Review 03: Part 3-1

public class ArrayIntro {

	public static void main(String[] args) {
		
		// Funny way
		int s1 = 85;
		int s2 = 98;
		int s3 = 95;
		int s4 = 90;
		
		int sum = s1 + s2 + s3 + s4;
		System.out.println("The sum is -> " + sum);
		
		// 1st serious way
		int[]grades = new int[4];
		grades[2] = 95;
		grades[0] = 85;
		grades[3] = 90;
		grades[1] = 98;

		// int size = grades.length;
		// The size of the array is 4
		// The index of the last element is 3
		
		int total = 0;
		for (int i = 0; i < grades.length; i++) {
			total += grades [i]; 
			
		}
		
		System.out.println("The total of the array is -> " + total);
		
		// 2nd serious way
		
		int[]numbers = {85, 98, 95, 90};
		
		int total2 = 0;
		
		// Get the elements from the array one by one, 
		// from the first to the last
		
		for (int num : numbers) {
			total2 += num;
		}
		
		System.out.println("The total of the array2 is -> " + total2);
		

	}

}
