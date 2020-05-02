package com.hsbc.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hsbc.commonlib.WebDriverBaseClass;

public class Day1_TitleValidation extends WebDriverBaseClass
{
	@Parameters({"ExpectedTitle"})
	@Test
	public void titleValidation(String sExpected) throws Exception
	{
		String sExpectedTitle = sExpected ;
		String sActualTitle = oDriver.getTitle();
		
		Assert.assertEquals(sActualTitle, sExpectedTitle);
	}
}
