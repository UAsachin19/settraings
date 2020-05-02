package com.hsbc.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.hsbc.commonlib.WebDriverBaseClass;

public class Day2_BingSearchValidation extends WebDriverBaseClass
{
	@Test
	public void bingSearchValidation() throws Exception
	{
			
		WebElement oEditBox;
		oEditBox = oDriver.findElement(By.id("sb_form_q"));
		oEditBox.sendKeys("selenium");
		//oEditBox.submit();
		
		Thread.sleep(5000);
		
		String sResult = oDriver.findElement(By.cssSelector(".sa_drw>li")).getText();
		
		System.out.println(sResult);
		Reporter.log(sResult);
		
		
		List<WebElement> oAllResults;
		
		//oAllResults = oDriver.findElements(By.xpath("//div[@class='sa_tm']/div"));
		oAllResults = oDriver.findElements(By.cssSelector(".sa_drw>li"));
		
		int iElement, iElementCount;
		WebElement oIndividualResult;
		
		iElementCount = oAllResults.size();
		String sTitle, sOutput;
		
		for(iElement=0; iElement<iElementCount; iElement++)
		{
			oIndividualResult = oAllResults.get(iElement);
			
			sTitle = oIndividualResult.getText();
			//System.out.printf("%d of %d = %s\n",
			//		iElement+1, iElementCount, sTitle);
			
			sOutput = String.format("%d of %d = %s\n", iElement+1, iElementCount, sTitle);
			System.out.print(sOutput);
			
			//Verify.verify(sOutput.contains("selenium"));
			Assert.assertTrue(sOutput.contains("selenium"), "Test Case Passed");
			Reporter.log(sOutput);
			
			
			/*
			 * if(sOutput.contains("selenium")) { System.out.println("--- Data Passed"); }
			 * else { System.out.println("-- Not contain selenium"); }
			 */
			 
			
			
		}
		
		
	}
}
