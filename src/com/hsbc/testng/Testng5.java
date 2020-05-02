package com.hsbc.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng5 
{
	@Test
	public void t1()
	{
		System.out.println("t1....");
		Assert.assertEquals("Selenium", "Selenium");
	}
	
	@Test(dependsOnMethods="t1")
	public void t2()
	{
		System.out.println("t2....");
		Assert.assertEquals("Selenium", "selenium");
	}
	
	@Test(dependsOnMethods="t2")
	public void t3()
	{
		System.out.println("t3....");
		int expected, actual;
		actual = 10;
		expected= 5;
		Assert.assertTrue(actual>expected, "Invalid values");
	}
	
	@Test(dependsOnMethods="t3")
	public void t4()
	{
		System.out.println("t4....");
		Assert.fail("Forced this mtd to fail...");
		
	}
}
