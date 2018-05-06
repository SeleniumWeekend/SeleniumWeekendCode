package com.windowhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalTest1
{
	public static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		WebElement departWebElm = driver.findElement(By.xpath("//input[contains(@id,'depart')]"));
		departWebElm.click();
		selectCalDate("2018", "July", "24");
	}
	
	public static void selectCalDate(String year, String month, String date)
	{
		
		for(int i=1; i<=12; i++)
		{
			try
			{
				String dateXpath = "(//span[text()='"+year+"']/preceding-sibling::span[text()='"+month+"']//following::a[text()='"+date+"'])[1]";
				driver.findElement(By.xpath(dateXpath)).click();
				break;
			}
			catch(Exception e)
			{
				WebElement nxtWebElm = driver.findElement(By.xpath("(//span[text()='Next'])[1]"));
				nxtWebElm.click();
			}
		}
		
	}

}
