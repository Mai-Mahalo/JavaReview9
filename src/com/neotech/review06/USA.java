package com.neotech.review06;

public class USA {
	
	//Part 2-1
	
	// Access Modifier, we define where the variable/method can be accessed from
	public String bestSchool = "Neotech"; // project level
	String state = "Texas"; // package level
	protected String mainState = "New York"; // package level
	private String capitalCity = "Washington DC"; // class
	
	public void attendNeoTech() {
		System.out.println("Neotech can be attended from everywhere.");
	}
	
	protected void playNBA() {
		System.out.println("Only countries in the same package can join NBA!");
	}
	
	private void selectPresident() {
		System.out.println("The US president can only be selected within USA!");
	}
	
	public static void main(String[] args) {
		USA us = new USA();
		
		System.out.println("Accessing the variable from inside USA");
		
		System.out.println("public -> " + us.bestSchool);
		System.out.println("default -> " +  us.state);
		System.out.println("private -> " + us.capitalCity);
		
		System.out.println("---------------------------");
		
		us.attendNeoTech();
		us.playNBA();
		us.selectPresident();
	}

}
