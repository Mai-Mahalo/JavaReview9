package com.neotech.review07;

//Part 1-2

public class HospitalApplication {

	public static void main(String[] args) {
		
		Doctor d1 = new Doctor("Joost", 220000, "Thai3890");
		d1.checkUp("David");
		
		// These are variables and methods of the child class
		
		// d1.dermId = "ABC";
		// d1.applySkinTreatment();
		
		System.out.println("------------------------------");
		
		// Creating a Dermatologist with NO initial information
		Dermatologist d2 = new Dermatologist();
		d2.name = "Nadim";
		d2.salary = 250000;
		d2.licenceId = "Az2056";
		d2.dermId = "D105";
		
		d2.checkUp("Leondro");
		d2.applySkinTreatment();
		
		System.out.println("------------------------------------");
		
		// Creating a Dermatologist with 4 parameters
		Dermatologist d3 = new Dermatologist ("Berfin", 300000, "Tr2605", "D007");
		d3.checkUp("Gulay");
		d3.applySkinTreatment();
		
		
		// Not possible, because the constructors are NOT inherited
		// Dermatologist d4 = new Dermatologist("Gulay", 275000, "Tr9031";)
		
		

	}

}
