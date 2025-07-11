package com.neotech.review07;

//Part 1-3

public class Dermatologist extends Doctor {
	
	//super(); = super constructor
	
	String dermId;
	
	// The default constructor is declared implicitly by the compiler
	Dermatologist(){
		super();
		// The default super constructor is being implicitly invoked
	}
		Dermatologist (String name, int salary, String licenceId, String dermId){
	
			super (name, salary, licenceId);
			// super.name = name;
			// super.salary = salary;
			// super.licenceId = licenceId;
			
			this.dermId = dermId;		
		}	
		public void applySkinTreatment() {
			System.out.println("Doctor " + name  + " applies skin treatment");
		}
		
		
	}
	

