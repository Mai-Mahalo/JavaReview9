package com.neotech.review09;

import java.util.ArrayList;
import java.util.Iterator;

//Part 4-3 (13:00)

public class StudentList {

	public static void main(String[] args) {
		
	ArrayList<Student> studentList = new ArrayList<>();
	
	// studentList.add("Aisha"); // not possible to add a String
	
	Student s1 = new Student("Aicha");
	studentList.add(s1);
	
	studentList.add(new Student("Monisha"));
	studentList.add(new Student("Nadim"));
	
	System.out.println("List size is -> " + studentList.size());
	System.out.println(studentList);
	
	System.out.println("-----------Using Enhanced For Loop---------------");
	
	for (Student element : studentList)
	{
		element.studentInfo();
	}
	System.out.println("----------Using Iterator------------");
	
	Iterator<Student> it = studentList.iterator();
	
	while(it.hasNext())
	{
		Student s = it.next();
		s.studentInfo();
		
	}
	
		

	}

}
