package com.neotech.review10;

import java.util.*;
import java.util.Map.Entry;

public class HW1_WorldMap {
	
	// HW1 iterate Europe by getting keys

	public static void main(String[] args) {
		
		Map<String, String> europe = new TreeMap<>(); // ordered by key
		europe.put("Italy", "Rome");
		europe.put("Spain", "Madrid");
		europe.put("Croatia", "Zagreb");
		System.out.println(europe);
		
		Map<String, String> africa = new LinkedHashMap<>(); // order is preserved
		africa.put("Tunisia", "Tunis");
		africa.put("Kenya", "Nairobi");
		africa.put("Egypt", "Cairo");
		System.out.println(africa);
		
		Map<String, String> asia = new HashMap<>(); // no order
		asia.put("Tajikistan", "Dushnbe");
		asia.put("Japan", "Tokyo");
		asia.put("Turkey", "Ankara");
		System.out.println(asia);
		
		System.out.println("-------");
			
		}
		

			
		}
		
	
		 
		
	


