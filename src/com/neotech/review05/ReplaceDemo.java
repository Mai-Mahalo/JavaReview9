package com.neotech.review05;

//part 4-1

public class ReplaceDemo {

	public static void main(String[] args) {
		String longStr = "I am very happy today because today is not Monday";
		
		String anotherStr = longStr.replace('a', 'e'); // removed a and replace to e for all.
		System.out.println(anotherStr);
		
		anotherStr = longStr.replace("today", "tomorrow");  
		System.out.println(anotherStr);
		
		System.out.println("-----------------------");
		
		// Regular Expression
		anotherStr = longStr.replaceAll("[ad]", "*"); 
		// ^ means "no", a-z= a to z, [ad] means only removed ad
		System.out.println(anotherStr);
		
		String ssn = "815-273-5061";
		System.out.println(ssn);
		
		String newSSN = ssn.replaceAll("[0-9]", "*");
		System.out.println(newSSN);
		
		System.out.println("Let's remove the dashes from ssn");
        String numbers = ssn.replaceAll("-", "");
        System.out.println(numbers);
        
        // A task for Mert and all hard working students
        // Hide all the numbers and leave the last four digits of ssn
        // ****-***-5061
	}

}
