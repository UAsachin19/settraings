package com.hsbc.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.hsbc.commonlib.WebDriverBaseClass;

public class Day2_HsbcScrollingPage extends WebDriverBaseClass
{
	@Test
	public void hsbcPageScroll() throws Exception
	{
		JavascriptExecutor oJsEngine;
		
		oJsEngine = (JavascriptExecutor) oDriver;
		
		oJsEngine.executeScript("window.scrollTo(0,600)");
		Thread.sleep(2000);
		
		oJsEngine.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
	}
}
