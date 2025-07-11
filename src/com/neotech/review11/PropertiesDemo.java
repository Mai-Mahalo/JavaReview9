package com.neotech.review11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// Part 1-1

public class PropertiesDemo {

	public static void main(String[] args) throws IOException   {
		
		// The path of this project (in my computer)
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		// The path of the properties file
		String filePath = projectPath + "/extra/demo.properties";
		System.out.println(filePath);
		
	    // \ is a special character for Java.
		
		    // fileIS will help me read the file
			FileInputStream fileIS = new FileInputStream(filePath);
			
			// proper is a Map
			Properties proper = new Properties();
			
			// load() method will help us erad from the file to the proper-map
			proper.load(fileIS);
			System.out.println(proper);
			
			// 1st way (We don't often use it)
			Object firstName =proper.get("FirstName");
			System.out.println(firstName);
			
			// 2nd way (recommended)
			String school = proper.getProperty("School");
			System.out.println(school);
			
			// I will get the Age as a String because of getProperty() method
			String age = proper.getProperty("Age");
			System.out.println(age);
			
			// Adding more key-value pairs (No need to do that at work)
			proper.setProperty("SSN", "207-81-2053");
			System.out.println(proper);
			
			// Re-assigning the Age (No need to do that at work)
			proper.setProperty("Age", "30");
			System.out.println(proper);
			
			// Now let us save into a New File
			
			// The path to the New File (We do not use it as a tester.)
			String newFilePath = projectPath + "/extra/NewFile.txt";
			FileOutputStream file0S = new FileOutputStream(newFilePath);
			
			proper.store(file0S, "Now Jackline is older!!!!");
			
			
			
	
		
		
	}
	

}
