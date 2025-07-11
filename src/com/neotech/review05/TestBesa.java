package com.neotech.review05;

//Part-1b

public class TestBesa {

	public static void main(String[] args) {
		
		Besa b = new Besa();
		
		b.addTwoNumbers();
		b.addTwoThatIGive(12, 17);
		
		int res1 = b.addTwoNumbersAndGiveMeTheResult();
		System.out.println("The result was " + res1);
		
		int res2 = b.addTwoNumbersAndGiveMeTheResult(12, 17);
		
		if (res2 == 29) {
			System.out.println("Good job Basa!");
		} else {
			System.out.println("I still love you!!!");
			
		}
		// I can directly print the result/return of the method
		System.out.println(b.addTwoNumbersAndGiveMeTheResult(14, 16));
		

	}

}
