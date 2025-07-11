package com.neotech.review03;

public class Pyramid {

	// Review 03: Part 1-2
	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****

			for (int row = 1; row <= 4; row++) {

				for (int col = 1; col <= row; col++) { 
				// changed to "row" from 4, then it will make a pyramid
					System.out.print("*");
				}

				System.out.println();
			}

		}








	}


