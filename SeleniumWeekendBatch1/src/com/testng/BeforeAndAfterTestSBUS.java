package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAndAfterTestSBUS
{
	public String s1 = "SBUS";
	
	@BeforeSuite
	public void addPreCondition()
	{
		System.out.println("Pre condition Added");
	}
	
	@AfterSuite
	public void closeConnection()
	{
		System.out.println("Connection Close");
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
	
}
