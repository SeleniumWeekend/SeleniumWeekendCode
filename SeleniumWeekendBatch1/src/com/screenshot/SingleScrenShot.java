package com.screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javaPropertiesFile.JpropertiesFile1;

public class SingleScrenShot 
{
	public WebDriver driver;
	@Test
	public void sarchProduct() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		String url1 = JpropertiesFile1.getValue("url");
		driver.get(url1);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		captureScreenShot("HomePage");
		
		driver.findElement(By.xpath("//a[@id='topNav_NewIn']")).click();
		Thread.sleep(4000);
		captureScreenShot("PLP");
		
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
