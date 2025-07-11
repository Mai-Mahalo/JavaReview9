package com.neotech.review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Part 1-1 & 2-1 (for task)

public class SetExample {
	// Collection
	// List / Set / Queue (Three interfaces inheriting Collection)
	
	// ArrayList | LinkedList (Two classes implementing List Interface)
	// HashSet | LinkedHashSet | TreeSet (Three classes implementing Set Interface)
	
	// 1. LIST preserves the insertion order, but SET does NOT.
	// 2. LIST contains duplicates, but SET contains UNIQUE objects
	
	public static void main(String[] args) {
		
		Set<String> africaLinked = new LinkedHashSet<>(); // up-casting
		
		africaLinked.add("Nigeria");
		africaLinked.add("South Africa");
		africaLinked.add("Egypt");
		africaLinked.add("Ghana");
		
		System.out.println("Size -> " + africaLinked.size());
		
		// It will NOT add in the SET, because it already exists!
		africaLinked.add("Egypt");
		
		System.out.println("Size -> " + africaLinked.size());
		
		// Can I add with an index in a SET? NO
		// africaLinked.add(2, "Morocco";)
		
		System.out.println("africaLinked -> " + africaLinked); // The order of insertion is preserved.
		
		Set<String> africaHash = new HashSet<>(africaLinked); // The order is randam
		
		System.out.println("africaHash -> " + africaHash);
		
		Set<String> africaTree = new TreeSet<>(africaLinked); // Alphabetical order
		
		System.out.println("africaTree -> " + africaTree);
		
		int size = africaTree.size();
		boolean contains = africaTree.contains("Kenya");
		boolean isEmpty = africaTree.isEmpty();
		
		boolean ableToRemove = africaTree.remove("Kenya");
		System.out.println("Was I able to remove Kenya? " + ableToRemove);
		
		// Note: We are NOT able to get/add/remove by index in a Set.
		// africaTree.get(2);
		
		System.out.println("----- 1st way, for loop DOES NOT work in a SET -----");
		
//		for (int i = 0, i < africaTree.size(); i++) {
//			africa.Tree.get(i);
		
		// Task until 11:55AM
		// Iterate africaTree using enhanced for loop and iterator
		
		System.out.println("----- 2nd way, using enhanced for loop -----");
		
		for (String country : africaTree) {
			System.out.println(country);
		
		}
		
		System.out.println("----- 3rd way, using iterator -----");
		Iterator<String> itCountry = africaTree.iterator();
		while(itCountry.hasNext()) {
			String country = itCountry.next();
			System.out.println(country);
		}
			
		}		
		
	}
	
	


