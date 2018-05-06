package com.assertion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion 
{
	@Test
	public void test1()
	{
		String[] lnkTxt = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<WebElement> lst= driver.findElements(By.xpath("//a"));
		
		lnkTxt = new String[lst.size()];
		int i=0;
		for(WebElement w1 : lst)
		{
			lnkTxt[i] = w1.getText();
			System.out.println(lnkTxt[i]);
			i++;
		}
		Assert.assertNotNull(lnkTxt, "Object is empty");
	}
}
