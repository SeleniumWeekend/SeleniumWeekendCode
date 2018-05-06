package com.windowhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		WebElement departWebElm = driver.findElement(By.xpath("//input[contains(@id,'depart')]"));
		departWebElm.click();
		
		String dateXpath = "(//span[text()='2018']/preceding-sibling::span[text()='May']//following::a[text()='19'])[1]";
		
		driver.findElement(By.xpath(dateXpath)).click();
		
	}

}
