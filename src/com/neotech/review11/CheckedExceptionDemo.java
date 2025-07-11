package com.neotech.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Part 4-2 (13:00)

public class CheckedExceptionDemo {

	public static void main(String[] args)  {
		
		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath + "/extra/democratic.properties";
		System.out.println(filePath);
		
		// 2 ways to handle a checked exception
		// Like a man -> surround with try/catch
		// Like a woman -> throw the exception away
		
			try {
				FileInputStream fis = new FileInputStream(filePath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Happy Ending!");

		// The complier error is called "check exception" or "Compile time exception"
		// "If the filePath is wrong, how do you want to handle with it?

	}

}
