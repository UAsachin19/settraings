package com.hsbc.commonlib;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class WebDriverBaseClass
{
	public WebDriver oDriver;
	
	@Parameters({"BrowserToBeOpened","AppUrl"})
	@BeforeClass
	public void initBrowser(String sBrowserName, String sAppUrl) throws Exception
	{
		oDriver = Utils.getDriver(sBrowserName);
		oDriver.get(sAppUrl);
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void exitBrowser() throws Exception
	{
		oDriver.quit();		
	}
	

}
