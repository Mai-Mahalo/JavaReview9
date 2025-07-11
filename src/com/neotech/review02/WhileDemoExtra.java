package com.neotech.review02;

public class WhileDemoExtra {

	public static void main(String[] args) {
		// Going backwoards
		
		int count = 5;
		while (count >= 1) {
			System.out.println("Count is -> " + count);
		}
		
		System.out.println("--------------------------");
		
		int i = 0;
		while (true) { // need to watch Part 2, Lesson 10 (Review), can't use "true"
			
			if(i == 4) {
				break;
			}
			
			System.out.println("i=" + i);
			i++;
		}
			
		}

	}


