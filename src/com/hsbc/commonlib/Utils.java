package com.hsbc.commonlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Utils 
{
	//-----------------------------------------------------------------------------
	
	public static Proxy getProxy() throws Exception
	{
		Proxy oProxy = new Proxy();
		
		if(AutomationConstants.bUseProxySettings)
		{
			oProxy.setProxyType(ProxyType.MANUAL);
			oProxy.setHttpProxy(AutomationConstants.sProxyHost);
			oProxy.setSslProxy(AutomationConstants.sProxyHost);
		}
		else
		{
			oProxy.setProxyType(ProxyType.DIRECT);
		}	
		return oProxy;
	}
	
	//-----------------------------------------------------------------------------
	
	public static InternetExplorerOptions getIEOptions() throws Exception
	{
		InternetExplorerOptions oOptions = new InternetExplorerOptions();
		oOptions.setProxy(getProxy());
		return oOptions;
	}
	
	//----------------------------------------------------------------------------
	
	public static ChromeOptions getChromeOptions() throws Exception
	{
		ChromeOptions oOptions = new ChromeOptions();
		oOptions.setProxy(getProxy());
		return oOptions;
	}
	
	//----------------------------------------------------------------------------
	
	public static FirefoxOptions getFirefoxOptions() throws Exception
	{
		FirefoxOptions oOptions = new FirefoxOptions();
		oOptions.setProxy(getProxy());
		return oOptions;
	}
	
	//------------------------------------------------------------------
	
	public static EdgeOptions getEdgeOptions() throws Exception
	{
		EdgeOptions oOptions = new EdgeOptions();
		oOptions.setProxy(getProxy());
		return oOptions;
	}
	
	//--------------------------------------------------------------------------------
	
	public static WebDriver getDriver(String sBrowserName) throws Exception
	{
		WebDriver oDriver;
		switch (getBrowserId(sBrowserName))
		{
			case 1: //ie
				System.setProperty("webdriver.ie.driver", AutomationConstants.sIEDriverPath);
			    oDriver = new InternetExplorerDriver(getIEOptions());
				break;
				
			case 2: //Chrome
				System.setProperty("webdriver.chrome.driver", AutomationConstants.sChromeDriverPath);
			    oDriver = new ChromeDriver(getChromeOptions());
				break;
				
			case 3: //Firefox
				System.setProperty("webdriver.gecko.driver", AutomationConstants.sGeckoDriverPath);
			    oDriver = new FirefoxDriver(getFirefoxOptions());
				break;
				
			case 4: //Edge
				System.setProperty("webdriver.edge.driver", AutomationConstants.sEdgeDriverPath);
			    oDriver = new EdgeDriver(getEdgeOptions());
				break;
				
			default:
				throw new Exception("Unknown Browser Type = " + sBrowserName);
		}
		
		oDriver.manage().deleteAllCookies();
		oDriver.manage().window().maximize();
		oDriver.manage().timeouts().pageLoadTimeout(AutomationConstants.lngPageLoadTimeout, TimeUnit.SECONDS);
		oDriver.manage().timeouts().implicitlyWait(AutomationConstants.lngImplicitWaitTimeout, TimeUnit.SECONDS);
		
		return oDriver;
	}	
	
	//--------------------------------------------------------------------------------
	
	public static int getBrowserId(String sBrowserName) throws Exception
	{
		if(sBrowserName.equalsIgnoreCase("ie")) return 1;
		
		if(sBrowserName.equalsIgnoreCase("chrome")) return 2;
		
		if(sBrowserName.equalsIgnoreCase("firefox")) return 3;
		
		if(sBrowserName.equalsIgnoreCase("edge")) return 4;
		
		return -1;
	}
	
	//----------------------------------------------------------------------------------------
}
