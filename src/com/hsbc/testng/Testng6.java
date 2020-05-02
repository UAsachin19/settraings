package com.hsbc.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng6 
{
	@Test
	public void hardAssertion()
	{
		System.out.println("Before hardAssertion - 1");
		Assert.assertEquals(10, 10);
		System.out.println("After hardAssertion - 1");
		
		System.out.println("Before hardAssertion - 2");
		Assert.assertEquals(10, 20);
		System.out.println("After hardAssertion - 2");
		
		System.out.println("Before hardAssertion - 3");
		Assert.assertTrue(10>20, "10 is not > 20");
		System.out.println("After hardAssertion - 3");
	}
	
	@Test
	public void softAssertion()
	{
		SoftAssert oSoftAssert = new SoftAssert();
		System.out.println("Before softAssertion - 1");
		oSoftAssert.assertEquals(10, 10);
		System.out.println("After softAssertion - 1");
		
		System.out.println("Before softAssertion - 2");
		oSoftAssert.assertEquals(10, 20);
		System.out.println("After softAssertion - 2");
		
		System.out.println("Before softAssertion - 3");
		oSoftAssert.assertTrue(10>20, "10 is not > 20");
		System.out.println("After softAssertion - 3");
		
		oSoftAssert.assertAll();
	}
}
