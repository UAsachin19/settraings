package com.hsbc.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hsbc.commonlib.WebDriverBaseClass;

public class Day2_HsbcSearchAjaxValidation extends WebDriverBaseClass
{
	@Test
	public void hsbcSearchAjaxValidation() throws Exception
	{
		WebElement oSearchIcon;
		
		oSearchIcon = oDriver.findElement(By.cssSelector("button[aria-label='Search']>.icon-search"));
		
		Actions oMouse = new Actions(oDriver);
		oMouse.moveToElement(oSearchIcon).build().perform();
		oMouse.click(oSearchIcon).build().perform();
		
		WebElement oEditBox;
		oEditBox = oDriver.findElement(By.id("search"));
		oEditBox.sendKeys("debit card");
		Thread.sleep(1000);
		
		List<WebElement> oAllAjaxResults;
		WebElement oIndividualResult;
		int iElement, iElementCount;
		
		oAllAjaxResults = oDriver.findElements(By.cssSelector(".suggestion-list>li"));
		iElementCount = oAllAjaxResults.size();
		String sResult;
		
		SoftAssert oSoftAssert = new SoftAssert();
		
		
		for(iElement=0;iElement<iElementCount;iElement++)
		{
			oIndividualResult = oAllAjaxResults.get(iElement);
			sResult = oIndividualResult.getText();
			System.out.printf("%d of %d = %s\n", iElement+1 , iElementCount, sResult);
			oSoftAssert.assertTrue(sResult.toLowerCase().contains("debit card"));
		}
		
		oSoftAssert.assertAll();
	}
}
