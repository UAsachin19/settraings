package com.hsbc.commonlib;

public class AutomationConstants
{
	public static String sEdgeDriverPath 	= "";
	public static String sIEDriverPath 	= "C:\\Users\\pc\\Work\\DriverExes\\IEDriverServer.exe";
	public static String sChromeDriverPath = "C:\\Users\\pc\\Work\\DriverExes\\chromedriver.exe";
	public static String sGeckoDriverPath = "C:\\Users\\pc\\Work\\DriverExes\\geckodriver.exe";

	public static long lngPageLoadTimeout = 60L;
	public static long lngImplicitWaitTimeout = 30L;
	
	public static boolean bUseProxySettings = false;
	public static String sProxyHost = "proxy.hsbc.com:8080";
}
