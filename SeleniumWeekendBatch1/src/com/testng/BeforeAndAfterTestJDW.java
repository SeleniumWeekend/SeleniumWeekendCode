package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterTestJDW 
{
	public String s1 = "JDW";
	@BeforeTest
	public void lunchApp()
	{
		System.out.println("App Launched "+s1);
	}
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("Login to App "+s1);
	}
	
	@Test
	public void createFolder()
	{
		System.out.println("Folder created "+s1);
	}
	
	@AfterMethod
	public void logOutFromApp()
	{
		System.out.println("Logout "+s1);
	}
	
	@AfterTest
	public void closeApp()
	{
		System.out.println("Application Closed "+s1);
	}
	
}
