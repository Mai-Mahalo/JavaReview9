package com.neotech.review08_abstraction;

// Part 1-2

public class Albanian extends Human {

	public Albanian(String name) {
		super(name);
		
	}

	@Override
	public void talk() {
		System.out.println(name + "says Pershendetje!");	
	}
	
	public void albanianDance()
	
	{
		System.out.println(name + "is dancing Valle Kosovare!");
		
	}
	
}

	
	
	

	
		



