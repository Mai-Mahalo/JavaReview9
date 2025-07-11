package com.neotech.review09;

import java.util.ArrayList;

//Part 3-2 (19:00)

public class NonGeneric {

	public static void main(String[] args) {
		
		// This is Non-Generic 
		// We don't use it 99%!!! Risky and hard to manage it!
		ArrayList europe = new ArrayList<>();
		// it is the same as if we said:
		// ArrayList<Object> arrayList = new ArrayList<>();
		
		europe.add("France");
		europe.add(15);
		europe.add('a');
		europe.add(true);
		
		for (Object el : europe)
		{
			System.out.println(el);
		}
		
		
		

	}

}
