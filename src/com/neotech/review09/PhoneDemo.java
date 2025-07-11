package com.neotech.review09;

//Part 1-2 (Need to watch again)

public class PhoneDemo {

	public static void main(String[] args) {
		
		Phone p = new Phone("S12345", "Sumsung", "Pass123");
		// we cannnot access the private values directly
		// p.serialNumber = "S234";
		// p.password = "NewPassword";
		p.displayInfo();
		
		String serial = p.getSerialNumber("Pass123");
		System.out.println("The serial numver is -> " + serial);
		
		p.setSerialNumber("S1234");
		p.displayInfo(); 
		// Has the serial number changed? NO
		// coz the pw has to be larger than 6 characters.
		
		p.setSerialNumber("S45678");
		// Has the serial number changed? YES
		
		p.displayInfo();
		
		System.out.println("--------------------");
		
		System.out.println("The brand is -> " + p.getBrand());
		
		// The brand is READ ONLY.
		// we cannot change it because there is no setter for it.
		
		boolean result = p.setPassword("Pass123", "NewPass");
		System.out.println("Is the password changed? " + result);
		
		if (p.setPassword("NewPass", "AnotherNewPass"))
		{
			System.out.println("Yaay, you changed the password!!!");
		}
		
		// brand: read only (no setter)
		// password: write only (no getter)
		// serialNumber: read and write
		// I can also have completely hidden variables (no Getter or Setter)
	

	}

}
