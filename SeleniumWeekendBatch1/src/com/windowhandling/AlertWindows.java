package com.windowhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindows {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement loginWebElm = driver.findElement(By.id("loginbutton"));
		
		loginWebElm.click();
		
		try
		{
			// Switch to alert windows
			Alert alt = driver.switchTo().alert();
			String actualTxt = alt.getText();
			System.out.println(actualTxt);
			if(actualTxt.equals("Enter User ID"))
			{
				alt.accept();
			}
		}
		catch(Exception e)
		{
			System.out.println("Alert is not present");
		}
		
		
	}

}
