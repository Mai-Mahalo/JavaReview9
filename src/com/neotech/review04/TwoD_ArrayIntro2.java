package com.neotech.review04;

import java.util.Arrays;

// Video part 1-2

public class TwoD_ArrayIntro2 {

	public static void main(String[] args) {
		
		
		// 1D Array
		//int[] num = {8, 4, 9};
		
		// 2D Array
		int[][]nums = {{6,1,3}, 
				       {8,7,2}, 
				       {9,4,1}, 
				       {5,2,6} 
    };
		System.out.println(nums [0][2]);
		System.out.println(nums [2][1]);
		
		System.out.println(nums [1][2]); //2
		System.out.println(nums [3][1]); //2
		
		System.out.println("-------------------------");
		
		// Nested enhanced for loop
		for (int[] row : nums) { // Every row : inside the numbers
		
			// I will iterate the row (1D-Array) with an enhanced for loop
			for (int element : row) {
				System.out.print(element + " ");
			}
			
			System.out.println();
			// If you add this sysout above, it will print like
			// 6 1 3
			// 8 7 2
			// 5 2 6
		}
		System.out.println("------------------");
			
		// How to get the row with index 2
	    int[] row2 = nums[2];
		System.out.println(Arrays.toString(row2));
			
		System.out.println("------------------");		
				
	// Combining Enhanced for loop with Normal for loop
			for (int[] row : nums) {
				for (int i = 0; i < row.length; i++) {
					System.out.print(row[i] + " ");
				}
				System.out.println();
	}

	}

}
