package com.hsbc.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;


import com.hsbc.commonlib.WebDriverBaseClass;

public class Day2_BingValidation extends WebDriverBaseClass
{
	@Test
	public void bingValidation() throws Exception
	{
			
		WebElement oEditBox;
		oEditBox = oDriver.findElement(By.id("sb_form_q"));
		oEditBox.sendKeys("selenium");
		oEditBox.submit();
		
		Thread.sleep(5000);
		
		String sResult = oDriver.findElement(By.xpath("//span[@class='sb_count']")).getText();
		String sTitle = oDriver.findElement(By.tagName("h2")).getText();
		
		System.out.println(sResult);
		System.out.println(sTitle);
		Reporter.log(sResult);
		
	}
}
