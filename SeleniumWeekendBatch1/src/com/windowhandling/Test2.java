package com.windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Capture the main window Id
		// 1
		String mainWinId = driver.getWindowHandle();
		
		// Capture all window ID
		
		Set<String> allWinIds = driver.getWindowHandles();
		                // 1, 2, 3, 4
		for(String winId : allWinIds)
		{
			if(!(mainWinId.equals(winId)))
			{
				driver.switchTo().window(winId);
				driver.close();
			}
		}
		
		// Giving control back to main Window id
		driver.switchTo().window(mainWinId);
		
		WebElement jobWebElm = driver.findElement(By.xpath("//div[text()='Jobs']"));
		jobWebElm.click();
		
		String expectedTitle = "Browse Jobs by Company, Location, Skills, Designation & Industry - Naukri.com";
		
		Set<String> allWinIds1 = driver.getWindowHandles();
		
		for(String winId : allWinIds1)
		{
			driver.switchTo().window(winId);
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(expectedTitle))
			{
				WebElement w1 = driver.findElement(By.xpath("//a[text()='Bank Jobs']"));
				Actions act = new Actions(driver);
				act.moveToElement(w1).click(w1).perform();
				Thread.sleep(2000);
			}
		}
		
		Set<String> allWinIds2 = driver.getWindowHandles();
		
		for(String winId : allWinIds2)
		{
			if(!(mainWinId.equals(winId)))
			{
				driver.switchTo().window(winId);
				driver.close();
			}
		}
		
		// Giving control back to main Window id
		driver.switchTo().window(mainWinId);
		
	}

}
