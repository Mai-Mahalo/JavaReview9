package com.neotech.review05;

// part 3-1

public class SubStringDemo {

	public static void main(String[] args) {
		
		String longStr = "I am very happy today because today is not Monday";
		
		String anotherStr = longStr.substring(5, 8); // 8 is NOT included
		System.out.println(anotherStr);
		
		String anotherStr2 = longStr.substring(5);
		System.out.println(anotherStr2);
		
		System.out.println("longStr -> " + longStr); //No change
		
		longStr = longStr.substring(10);
		System.out.println("longStr -> " + longStr); // YES change
		
		// Run-tim Error
		// longStr.substring(5, 2);
		// longStr.substring(5, 100);
		// longStr.substring(-5, 5);
		// Substring only accept int (CAN NOT use String)
		
		
		
	}

}
