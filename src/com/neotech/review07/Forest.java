package com.neotech.review07;

public class Forest {
	
//Part 2-3 & 3-1 

	public static void main(String[] args) {
		
		Wolf w = new Wolf("Rusty", 4);
		w.sleep();
		w.displayInfo();
		
		System.out.println("--------------------------------");
		
		Fox f = new Fox ("Sly", 4, "Orange");
		f.sleep();
		f.displayInfo();
		
		System.out.println("--------------------------------");
		
		Bear b = new Bear ("Yogi", 2);
		b.sleep();
		b.displayInfo();
		b.roar();
		
		
	}
}
        

