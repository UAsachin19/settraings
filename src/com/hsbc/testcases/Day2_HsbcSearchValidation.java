package com.hsbc.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hsbc.commonlib.WebDriverBaseClass;

public class Day2_HsbcSearchValidation extends WebDriverBaseClass
{
	@Test
	public void hsbcSearchValidation() throws Exception
	{
		WebElement oSearchIcon;
		
		oSearchIcon = oDriver.findElement(By.cssSelector("button[aria-label='Search']>.icon-search"));
		
		Actions oMouse = new Actions(oDriver);
		//oMouse.moveToElement(oSearchIcon).build().perform();
		oMouse.click(oSearchIcon).build().perform();
		
		WebElement oEditBox;
		oEditBox = oDriver.findElement(By.id("search"));
		oEditBox.sendKeys("debit card");
		oEditBox.submit();
		
		Thread.sleep(5000);
		
		String sResult = oDriver.findElement(By.cssSelector("#search-results-container>p")).getText();
		
		System.out.println(sResult);
		Reporter.log(sResult);
		
		
		List<WebElement> oAllResults;
		
		oAllResults = oDriver.findElements(By.xpath("//div[@id='search-results-container']/div"));
		//oAllResults = oDriver.findElements(By.cssSelector("#search-results-container>div"));
		
		int iElement, iElementCount;
		WebElement oIndividualResult;
		
		iElementCount = oAllResults.size();
		String sTitle, sOutput;
		
		for(iElement=0; iElement<iElementCount; iElement++)
		{
			oIndividualResult = oAllResults.get(iElement);
			
			sTitle = oIndividualResult.findElement(By.tagName("h2")).getText();
			
			//System.out.printf("%d of %d = %s\n",
			//		iElement+1, iElementCount, sTitle);
			
			sOutput = String.format("%d of %d = %s", iElement+1, iElementCount, sTitle);
			System.out.println(sOutput);
			Reporter.log(sOutput);
		}
		
		
	}
}
