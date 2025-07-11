package com.neotech.review10;

import java.util.*;
import java.util.Map.Entry;

//Part 3-1 & 4-1

public class MapExample {
	// Map
	// HashMap | LinkedHashMap | TreeMap | HashTable

	public static void main(String[] args) {
	
		Map<Integer, String> phonebook = new HashMap<>();
		phonebook.put(123456789, "John Smith"); // (key, value) -> entry
		phonebook.put(234567890, "Taylor Swift");
		phonebook.put(345678901, "Donald Trump");
		phonebook.put(111111111, "Obama");
		phonebook.put(456789012, "John Smith");
		
		// It will replace Taylor Swift with Alaric
		phonebook.replace(234567890, "Alaric");
		
		// Another way to replace
		// phonebook.put(234567890, "Alaric");
		
		System.out.println(phonebook);
		
		// Map is one-directional, from the KEY to the VALUE
		// There is NO way to go from the VALUE to the KEY
		
		String name = phonebook.get(111111111);
		System.out.println(name + " is calling...");
		
		name = phonebook.get(333);
		System.out.println(name + " is calling..."); 
		// will print "null" is calling because nobody uses "333" as a phone number.
		
		boolean containsK = phonebook.containsKey(234567890);
		System.out.println("The phonebook contains 234567890 -> " + containsK);
		
		boolean containsV = phonebook.containsValue("Taylor Swift");
		System.out.println("Taylor Swift is in my phonebook -> " + containsV);
		
		phonebook.remove(345678901); // Will remove the pair/entry from my map
		System.out.println(phonebook);
		
		System.out.println("The size of my phonebook is -> " + phonebook.size());
		// Should be 4 because we've removed Donald Trump.
		
		// We CANNOT iterate the Map.
		
		// Let's get all the KEYS and store them into a SET
		System.out.println("--------phonebook.keySet()--------");
		
		Set<Integer> numbers = phonebook.keySet();
		System.out.println(numbers);
		
		Iterator<Integer> itNums = numbers.iterator();
		while (itNums.hasNext()) {
			Integer number = itNums.next();
			
			// Find the name/value by using the number/key
			String personName = phonebook.get(number);
			System.out.println(number + " -> " + personName);		
		}
		
		// Let's get all the VALUES and store them in a COLLECTION
		System.out.println("--------phonebook.values()--------");
		
		Collection<String> names = phonebook.values();
		System.out.println(names);
		
		// From the value we CANNOT find the key
		// phonebook.get(element);
		
		// Task
		// Get the Entries from the Map
		// Iterate them using Enhanced for loop
		// Iterate them using Iterator
		
		// let's get all the ENTRIES and store them in a SET
		System.out.println("--------phonebook.entrySet()--------");
		
		Set<Entry<Integer, String>> entries = phonebook.entrySet();
		System.out.println("map -> " + phonebook);
		System.out.println("set -> " + entries);
		
		System.out.println("--------using enhanced for loop--------");
		for (Entry<Integer, String> entry : entries) {
			// System.out.println(entry);
			
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println("--------using iterator--------");
		Iterator<Entry<Integer, String>> entryIt = entries.iterator();
		
		while (entryIt.hasNext()) {
			Entry<Integer, String> entry = entryIt.next();
			
			System.out.println(entry.getKey() + "<->" + entry.getValue());	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
