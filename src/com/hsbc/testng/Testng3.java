package com.hsbc.testng;

import org.testng.annotations.Test;

public class Testng3 
{
	@Test(invocationCount=10)
	public void t1()
	{
		System.out.println("t1....");
	}
	
	@Test(enabled= false)
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
}
