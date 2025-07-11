package com.neotech.review02;

public class ContinueDemo {

	public static void main(String[] args) {
		// Task until 1:25PM
		// I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
		// but not 13th birthday, because we are scared
		// Let's use for loop
		
		// 1st iteration -> 1. initialization; 2. Check the condition
		// Next iteration -> 1. incrementing 2. Check the condition
		
		for(int age = 11; age <= 20; age++) {
			
			if (age == 13) {
				continue;
			}
			
			System.out.println("Happy Birthday! You are " + age + " years old!");
		}
		
		System.out.println("-----Same thing using WHILE loop------");
		
		int age2 = 11;
		while (age2 <= 20){
			age2++;
			
			if (age2 == 13) {
				continue;
			}
			
			System.out.println("Hapy Birthday! You are " + age2 + " years old!");
		
		}
		
		
		{
		}
			
		

	}

}
