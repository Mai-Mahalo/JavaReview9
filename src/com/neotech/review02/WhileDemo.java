package com.neotech.review02;

public class WhileDemo {

	public static void main(String[] args) {
		String greeting = "Miremengjes";
		
//		System.out.println("Miremengjes");
//		System.out.println("Miremengjes");
//		System.out.println("Miremengjes");
//		System.out.println("Miremengjes");
//		System.out.println("Miremengjes");
		
		int num = 1;
		while(num <= 5) {
			System.out.println(greeting);
			num = num + 1; // or num++ (but we can't increase more than 2.) 
		}
		
		


	}

}
