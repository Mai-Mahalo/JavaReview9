package com.neotech.review04;

public class TwoD_ArrayIntro3 {

	public static void main(String[] args) {
		
		int[][] nums = {
				{6, 3}, // = one element
				{9, 2, 7, 4}, 
				{8}
		};
		
		System.out.println(nums[1][2]);
		System.out.println(nums[2][0]); // 8 = must be indicate two numbers
		
		//System.out.println(nums[0][2]); // run-time error = We can still run.
		
		System.out.println("--------------------------------");
		
		System.out.println("The number of row is -> " + nums.length);
		System.out.println("The length of the row with index 1 -> " + nums[1].length);
		System.out.println("The length of the row with index 0 -> " + nums[0].length);
		System.out.println("The length of the row with index 2 -> " + nums[2].length);
		// We can't print the columns in this way. We can do with the for loop below.
		
		System.out.println("--------------------------------");
		
		//Nested for loop
		for (int row = 0; row < nums.length; row++) {
			
			// nums[row].length will give me the length of the specific row
			
			for (int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + " ");
				
			}
			System.out.println();
			
		}
		
		System.out.println("--------------------------------");
		
		// Nested enhanced/advanced for loop
		for (int[] row : nums) { // = Every row inside the numbers, // get one dimension of Array
			for (int element : row) { // from one dimension of Array, I got element.
				System.out.print(element + " ");
				
			}
			
			System.out.println();
		}
		
		

	}

}
