package com.synechron.java.basic;

import java.util.Date;

public class HelloWorld 
{
	/*
	 * 0. data types
	 * 1. variables
	 * 2. methods
	 * 3. constructors
	 * 4. SIB
	 * 5. IIB 
	 */
	public static void main(String[] args) 
	{
		System.out.println("Hello All, Welcome to Java/Selenium Sessions");
		Date d = new Date();
		System.out.println(d.toString().replace(" ", "_").replace(":", "_"));
	
		
	}
}
