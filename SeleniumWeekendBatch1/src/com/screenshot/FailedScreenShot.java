package com.screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailedScreenShot 
{
	public WebDriver driver;
	@Test
	public void searchProduct1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void tearDown(ITestResult itr)
	{
		String status = getResultStatus(itr);
		if(status.equals("Fail"))
		{
			captureScreenShot(itr.getMethod().getMethodName()+" Fail");
		}
		
		if(status.equals("Pass"))
		{
			captureScreenShot(itr.getMethod().getMethodName()+" Pass");
		}
		if(status.equals("Skipped"))
		{
			captureScreenShot(itr.getMethod().getMethodName()+" Skipped");
		}
	}
	
	public String getResultStatus(ITestResult it)
	{
		int status = it.getStatus();
		System.out.println(status);
		switch(status)
		{
			case 1:
				return "Pass";
			case 2:
				return "Fail";
			case 3:
				return "Skipped";
			
		}
		return "Not Completed";
	}
	
	
	
	
	public void captureScreenShot(String sName)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\SHALINI KUMARI\\git\\WeekendcodeWork\\SeleniumWeekendBatch1\\ScreenShot\\"+sName+".png");
		
			FileUtils.copyFile(source, destination);
		}
		catch(Exception e)
		{
			new Exception("File Not Found Exception");
		}
	}
}
