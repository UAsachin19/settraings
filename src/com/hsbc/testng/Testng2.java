package com.hsbc.testng;

import org.testng.annotations.Test;

public class Testng2 
{
	@Test(priority=120)
	public void t1()
	{
		System.out.println("t1....");
	}
	
	@Test(priority=10)
	public void t2()
	{
		System.out.println("t2....");
	}
	
	@Test(priority=-10)
	public void t3()
	{
		System.out.println("t3....");
	}
	
	@Test
	public void a4()
	{
		System.out.println("a4....");
	}
}
