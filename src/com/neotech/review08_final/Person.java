package com.neotech.review08_final;

//Part 3-3 (26:00)

public class Person {
	
	// instance varibale
	String name;
	// final variable (must be initialized and cannot be changed)
	final String id;
	
	public Person(String name, String id)
	{
		this.name = name;
		this.id = id;
	}
	
	public void info()
	{
		System.out.println("ID: " + id + "\nName: " + name);
	}
	
	public final void sayHello()
	{
		System.out.println("Hello " + name + "!");
	}
	

}
