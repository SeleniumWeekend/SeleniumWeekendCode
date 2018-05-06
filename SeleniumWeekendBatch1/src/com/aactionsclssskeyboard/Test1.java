package com.aactionsclssskeyboard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://drive.google.com");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		List<WebElement> lst = driver.findElements(By.xpath("(//a[text()='Go to Google Drive'])[2]"));
		
		if(lst.size()>0)
		{
			driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]")).click();
		}
		Thread.sleep(4000);
		
		Actions act = new Actions(driver);
		
		act.sendKeys("seleniumweekend").perform();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(4000);
		
		// Enter invalid Password
		act.sendKeys("fdjgjfgf").build().perform();
		
		// Perform with single key
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement usname = driver.findElement(By.xpath("//div[contains(text(),'@gmail.com')]"));
		
		act.doubleClick(usname).perform();
		
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		
		WebElement pw = driver.findElement(By.name("password"));
		
		act.sendKeys(pw, Keys.chord(Keys.CONTROL,"v")).perform();
		
	}
}
