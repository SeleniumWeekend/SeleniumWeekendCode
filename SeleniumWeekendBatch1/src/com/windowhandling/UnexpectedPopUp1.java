package com.windowhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnexpectedPopUp1 extends Thread
{
	public static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		UnexpectedPopUp1 u1 = new UnexpectedPopUp1();
		u1.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=0; i<=10; i++)
			{
				WebElement closeWebElm = driver.findElement(By.xpath("Xpath of close pop up"));
				closeWebElm.click();
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			new Exception("PopUp Not Present");
		}
	}
}
