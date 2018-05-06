package com.windowhandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Capture the main window Id
		
		String mainWinId = driver.getWindowHandle();
		
		// Capture all window ID
		
		Set<String> allWinIds = driver.getWindowHandles();
		
//	     Using For each loop
//		for(String winId : allWinIds)
//		{
//			if(!(mainWinId.equals(winId)))
//			{
//				driver.switchTo().window(winId);
//				driver.close();
//			}
//		}
		
//      Using Iterator
		Iterator<String> itr = allWinIds.iterator();
		
		while(itr.hasNext())
		{
			String winId = itr.next();
			if(!(winId.equals(mainWinId)))
			{
				driver.switchTo().window(winId);
				driver.close();
			}
		}
		
		
		driver.switchTo().window(mainWinId);
	}

}
