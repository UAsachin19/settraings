package com.hsbc.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng4 
{
	@Test
	public void t1()
	{
		System.out.println("t1....");
		Assert.assertEquals("Selenium", "Selenium");
	}
	
	@Test
	public void t2()
	{
		System.out.println("t2....");
		Assert.assertEquals("Selenium", "selenium");
	}
	
	@Test
	public void t3()
	{
		System.out.println("t3....");
		int expected, actual;
		actual = 10;
		expected= 5;
		Assert.assertTrue(actual>expected, "Invalid values");
	}
	
	@Test
	public void a4()
	{
		System.out.println("a4....");
		Assert.fail("Forced this mtd to fail...");
		
	}
}
