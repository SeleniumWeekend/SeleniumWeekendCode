package com.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 
{
	public String s1 = "SimplyBEUS";
	
	@BeforeClass
	public void lounchApp()
	{
		System.out.println("Lounch Applicaton "+s1);
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
	@Test
	public void deleteFolder()
	{
		System.out.println("Folder deleted "+s1);
		System.out.println();
	}
	
	@AfterMethod
	public void logOutFromApp()
	{
		System.out.println("Logout "+s1);
	}
	
	@AfterClass
	public void closeApp()
	{
		System.out.println("App Close "+s1);
	}
}
