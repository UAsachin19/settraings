package com.hsbc.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng7 
{
	@Test
	public void t1()
	{
		System.out.println("t1....");
	}
	
	@Test
	public void t2()
	{
		System.out.println("t2....");
	}
	
	@Test
	public void t3()
	{
		System.out.println("t3....");
	}
	
	@Test
	public void a4()
	{
		System.out.println("a4....");
	}
	
	@BeforeMethod
	public void methodSetup()
	{
		System.out.println("Method Setup....");
	}
	
	@AfterMethod
	public void methodTeardown()
	{
		System.out.println("Method Teardown....");
		
	}
	
	@BeforeClass
	public void classSetup()
	{
		System.out.println("Class Setup....");
	}
	
	@AfterClass
	public void classTeardown()
	{
		System.out.println("Class Teardown....");
	}
	
}
