package com.actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jdwilliams.co.uk/");
		
		WebElement w1 = driver.findElement(By.xpath("(//a[text()='Accessories'])[3]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(w1).perform();
		
		Thread.sleep(2000);
		
		WebElement bagWebElm = driver.findElement(By.xpath("(//a[text()='Bags'])[1]"));
		bagWebElm.click();
	}

}
