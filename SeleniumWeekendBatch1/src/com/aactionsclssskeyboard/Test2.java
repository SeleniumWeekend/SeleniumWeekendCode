package com.aactionsclssskeyboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://drive.google.com");
		
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
		
		WebElement usname = driver.findElement(By.xpath("//div[contains(text(),'@gmail.com')]"));
		
		act.doubleClick(usname).perform();
		
		String s1 = Keys.chord(Keys.CONTROL,"c");
		act.sendKeys(s1).perform();
		
		act.sendKeys(Keys.TAB, Keys.TAB).perform();
		
		act.sendKeys(Keys.chord(Keys.CONTROL, "v")).perform();
		
//		WebElement pw = driver.findElement(By.name("password"));
//		
//		act.sendKeys(pw, Keys.chord(Keys.CONTROL,"v")).perform();
		
		String[] s2= {"dfkfh", "fdknf12@", "1233", "#$%", "658568gjg"};
		
	}

}
