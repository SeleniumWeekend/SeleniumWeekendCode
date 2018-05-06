package com.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureAllLink {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement> lst = driver.findElements(By.tagName("a"));
		
		int linkLen = lst.size();
		
		String[] allLinks = new String[linkLen];
		
		int i=0;
		for(WebElement webElm : lst)
		{
			allLinks[i]= webElm.getAttribute("href");
			i++;
		}
		
		for(String link : allLinks)
		{
			driver.navigate().to(link);
		}
	}

}
