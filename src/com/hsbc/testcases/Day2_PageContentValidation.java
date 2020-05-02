package com.hsbc.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hsbc.commonlib.WebDriverBaseClass;

public class Day2_PageContentValidation extends WebDriverBaseClass
{
	@Parameters({"expectedcontent"})
	@Test
	public void pageContentValidation(String sExpectedContent) throws Exception
	{
		Assert.assertTrue(oDriver.getPageSource().contains(sExpectedContent), 
				          "Unable to find : " +sExpectedContent);
	}
}
