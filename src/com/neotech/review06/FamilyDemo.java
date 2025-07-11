package com.neotech.review06;

//Part 1-2 (better to watch for review)

public class FamilyDemo {

	public static void main(String[] args) {
		
		// I CAN access stati/class variables before I create an object
		FamilyMember.lastName = "Ronald";
		
		// I CANNOT access instance variables before I create an object.
		// FamilyMember.firstName = "Cristiano";
		
		// I CAN access static/class methods, before I create an object
		FamilyMember.printFamilyName();
		
		// I CANNOT access instance methods before I create an object
		// FamilyMember.printFullName();
		
		System.out.println("--------------------------");
		
		FamilyMember member1 = new FamilyMember();
		member1.firstName = "Cristiano";
		member1.age = 40;
		
		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Georgina";
		member2.age = 25;
		
		member1.printFullname();
		member2.printFullname();
		
		System.out.println("------------------------");
		System.out.println("They decided to change their lastname!!!");
		
		FamilyMember.lastName = "GOAT";
		member1.firstName = "CR7";
		
		member1.printFullname();
		member2.printFullname();
		
		System.out.println("----------------------");
		
		// They are making a baby
		FamilyMember baby = new FamilyMember();
		
		// Does the baby have a firstName?
		System.out.println("Baby firstName -> " + baby.firstName);
		
		// Does the baby have a lastName?
		System.out.println("Baby lastName -> " + FamilyMember.lastName);
		
		baby.printFullname();
		
		
		
		
		

	}

}
