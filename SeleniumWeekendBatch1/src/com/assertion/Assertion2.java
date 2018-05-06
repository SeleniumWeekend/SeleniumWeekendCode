package com.assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {

	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='topNav_NewIn'])[1]")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getTitle().contains("New In"), "FAIL");
		System.out.println("Other Stmt");
		
		Assert.assertFalse(driver.getTitle().contains("New In"), "FAIL");
		System.out.println("Other Stmt1");
	}
	
}
