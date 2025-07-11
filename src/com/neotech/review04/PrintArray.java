package com.neotech.review04;

import java.util.Arrays;

// Video Part 1-1

public class PrintArray {

	public static void main(String[] args) {
		
		int[] numbers = {4, 18, -10, 5, 12};
		
		// When you try to print the Array we see something that does not make sense
		System.out.println(numbers);
		
		// To print 1D-Array we use toString() method
		// Remind: Need to import like Scanner (Cmd + Shift + O)
		System.out.println(Arrays.toString(numbers));
		
		int[][] nums = {{3, 4, 6}, {2, 0, 9}, {5, 8, 1}};
		
		// To print 2D-Array we use deepTpString() method
		// "deepToString" is not used often.
		System.out.println(Arrays.deepToString(nums));
		
		

	}

}
