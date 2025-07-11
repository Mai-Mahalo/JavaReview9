package com.neotech.review08_interfaces;

//Part 2-2

// A class can extend ONLY one class
// A class can implement MULTIPLE interfaces

public class Apple extends Fruit implements Peelable, Washable {

	public Apple(String color) {
		super(color);
	}
	
	@Override
	public void wash() {
		System.out.println("Washing the Apple");
	}
	
	@Override
	public void peel() {
		System.out.println("Peeling the Apple!");
	}
	
}

	
	
	

	
	
	


