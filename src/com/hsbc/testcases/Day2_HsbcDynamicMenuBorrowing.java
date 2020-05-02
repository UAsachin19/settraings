package com.hsbc.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hsbc.commonlib.WebDriverBaseClass;

public class Day2_HsbcDynamicMenuBorrowing extends WebDriverBaseClass
{
	@Test
	public void hsbcDynamicMenuBorrowing() throws Exception
	{
		WebElement oMainMenu;
		
		oMainMenu = oDriver.findElement(By.xpath("//span[text()='Borrowing']"));
		
		Actions oMouse = new Actions(oDriver);
		oMouse.moveToElement(oMainMenu).build().perform();
		
		Thread.sleep(1000);
		
		oDriver.findElement(By.linkText("Home Loan")).click();
		
		Thread.sleep(5000);
		
		Assert.assertTrue(oDriver.getPageSource().contains("HSBC Home Loan"));
		
		
	}
}
