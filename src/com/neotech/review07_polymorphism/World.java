package com.neotech.review07_polymorphism;

public class World {
	
// Part 4-3

	public static void main(String[] args) {
		Human.planet = "Earth";

		Human h1 = new Human();
		System.out.println(h1.name + " lives on " + Human.planet);

		Human h2 = new Human("Monisha");
		System.out.println(h2.name + " lives on " + Human.planet);

		Human.planet = "Mars";

		System.out.println("--------------------------------");

		System.out.println(h2.name + " lives on " + Human.planet);

		// Declaring a variable of type Human
		Human h3;

		// Creating an Albanian and assigning to h3
		h3 = new Albanian("David"); // up-casting

		System.out.println(h3.name + " lives on " + Human.planet);

		// h4 is a variable of type Human
		// inside h4 we are storing a Turkish person
		Human h4 = new Turkish("Burak"); // up-casting, automatically

		System.out.println("--------------------------------");
		System.out.println("Let's make them talk!");

		h1.talk();
		h2.talk();
		h3.talk();
		h4.talk();

		// Polymorphism
		// Method Overriding
		// Run time Polymorphism/late binding/dynamic binding

		// Compile time error, because h4 is of type Human
		// h4.makeBaklava();

		System.out.println("--------------------------------");

		Turkish t1 = (Turkish) h4; // down-casting, manually
		t1.makeBaklava();

		// This will give a run-time error
		// Turkish t2 = (Turkish) h3;
		// t2.makeBaklava();

		System.out.println("--------------------------------");

		// This is a safe way to down-cast
		if (h3 instanceof Turkish) {

			// Can cast/convert into Turkish
			Turkish tur = (Turkish) h3;
			tur.makeBaklava();
		} else if (h3 instanceof Albanian) {

			// Can cast/convert into Albanian
			Albanian alb = (Albanian) h3;
			alb.albanianDance();
		}

		System.out.println("--------------------------------");

		American us1 = new American("Donald", "342-58-0061");
		us1.talk();
		us1.taxReturn();

		Human h5 = us1; // up-casting, implicitly
		h5.talk();
		// h5.taxReturn();

		American us2 = (American) h5; // down-casting, explicitly
		us2.taxReturn();

		System.out.println("--------Power of Polymorphism--------");

		Human[] humans = new Human[6];
		humans[0] = h1;
		humans[1] = h2;
		humans[2] = h3;
		humans[3] = h4;
		humans[4] = h5;
		humans[5] = new American("Barrack", "secret"); // up-casting
		// This is possible ONLY because of inheritance

		for (Human element : humans) {
			element.talk();
		}

	}

}