package com.neotech.review08_abstraction;

// Part 1-1

public abstract class Human {
	
	String name; // every human has their own name
	static String planet; // they share the same planet
	
	//parametrized constructor
	public Human(String name)
	{
		this.name = name;	
	}
	
	// Method is declared ut not implemented
	public abstract void talk();
	
	// Can we overload abstract methods? Yes we can.
	// public abstract void talk (String str);
	
	//implemented method
	public void sleep()
	{
		System.out.println("Every human sleeps the same!!!");
	}
	
	
	

}
