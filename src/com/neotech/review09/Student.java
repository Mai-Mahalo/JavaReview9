package com.neotech.review09;

//Part 4-2 (12:00)

public class Student {
	
	String name;
	
	public Student(String name)
	{
		this.name = name;
	}
	
	public void studentInfo()
	{
		System.out.println("The student name is  ---> " + name);
	}
	
	/* this method overrides the Object.toString() method.
	 * This method will construct a String representation of an Object
	 * To come up with it, just ask yourself what info of this object do you 
	 * want to see when you print the object?
	 */
	
	public String toString()
	{
		return name;
	}

}
