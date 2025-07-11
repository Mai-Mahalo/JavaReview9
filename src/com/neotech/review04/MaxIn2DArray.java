package com.neotech.review04;

// Video Part 2-1 (attended on live)

public class MaxIn2DArray {
	
	// Breask until 12:27
	// Find the biggest number in a 2D Array

	public static void main(String[] args) {
	
	// Done myself	
		
			
			
			
			
	// In-class
		
		int[][] b = {
				{-2, 3, 5},
				{2, 4, 7},
				{8, 1, -9},
				{3, 15, 1}
				
		};
		
		int biggest = b[0][0];
		// We don't start with zero, numbers might be negative
		
		for (int row = 0; row < b.length; row++) {
			
			for (int col = 0; col < b[row].length; col++) {
				int element = b[row][col]; 
				// Don't forget make like a box.
				
				if(element > biggest) {
					// I found a bigger element
					// I have to update the biggest
					biggest = element;			
					
				}
				
			}
			
		}
		
		System.out.println("The biggest number is -> " + biggest);
		
		
		}
		
		
			
		}
		
				

	


