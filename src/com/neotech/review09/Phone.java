package com.neotech.review09;

// Part 1-1 (better to watch again)

public class Phone {
	
	private String serialNumber;
	private String brand;
	private String password;
	
	// the only way to create an object of this class is:
	      // new Phone ("1234567", "Samsung", "abc")
	public Phone(String serialNumber, String brand, String password)
	{
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.password = password;
	}
	
	public void displayInfo()
	{
		System.out.println("This is a " + this.brand + " phone with serial number " + serialNumber);
	}
	
	// Getter and Setters
	
	// You can only get the serial number if you have the correct password
	
	/*
	 * This method allows the user to get the phone serial number if they provide
	 * the correct password.
	 * 
	 * @param password
	 * @return
	 */
	
	public String getSerialNumber(String password)
	{
		if(password.equals(this.password))
		{
			return serialNumber;
		}
		else
		{
//			System.out.println("Access denied!!!");
			return "Access Denied!!!";
		}
	}
	
	// You can only reset the serial number with a value 6 or more characters
	public void setSerialNumber(String serialNumber)
	{
		if (serialNumber.length() >= 6)
			this.serialNumber = serialNumber;
	}
	public String getBrand()
	{
		return brand;	
	}
	
	// can we write a setter for password change
	       // the value will change only if the old password is correct.
	       // return boolean to let the users know if it was successful or not
	
	public boolean setPassword(String oldPassword, String newPassword)
	{
		if(oldPassword.equals(this.password))
		{
			this.password = newPassword;
			return true;	
		}
		else
		{
			System.out.println("Access Denied!!!");
			return false;
		}	
	}
	

}
