package com.neotech.review08_interfaces;

// Part 3-2

public class FruitDemo {

	public static void main(String[] args) {
		// I cannot create an object of interfaces!!!
		
		Apple a = new Apple("Red");
		a.wash();
		a.peel();
		
		Coconut c = new Coconut("Brown");
		c.crack();
		
		Fruit f = new Apple ("Yellow"); // up-casting
//		f.wash();
//		f.peel();
		
		Apple a2 = (Apple) f; // down-casting
		a2.wash();
		a2.peel();
		
		// Peeable p2 = new Peelable();
		
		Peelable p2 = new Apple ("Green");
		p2.peel(); // I can only access what Peelable includes
		// p2.wash(); // wash() is not defined in the Peelable interface
		
		// how can I access wash() using p2?
		Apple a3 = (Apple) p2;
		a3.wash();
		
		
		

	}

}
