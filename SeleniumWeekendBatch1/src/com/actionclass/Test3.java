package com.actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

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
//		WebElement unWebElm  = driver.findElement(By.xpath("//input[@name='identifier']"));
//		unWebElm.sendKeys("seleniumweekend");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("seleniumweekend").perform();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(4000);
		
//		WebElement pwWebElm = driver.findElement(By.name("password"));
//		pwWebElm.sendKeys("Abcd@123");
		
		act.sendKeys("Abcd@123").perform();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(7000);
		
		WebElement newBtn = driver.findElement(By.xpath("(//div[text()='New'])[1]"));
//		newBtn.click();
		
		act.moveToElement(newBtn).click(newBtn).perform();
		
		Thread.sleep(2000);
		
		WebElement fldWebElm= driver.findElement(By.xpath("//div[text()='Folder']"));
		fldWebElm.click();
		
		
		act.sendKeys("SampleFolder").perform();
		
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		
		Thread.sleep(3000);

		WebElement fld = driver.findElement(By.xpath("//span[text()='SampleFolder']"));
		
		act.contextClick(fld).perform();
		
		WebElement w1 = driver.findElement(By.xpath("//div[contains(text(),'Change color')]"));
	
		act.moveToElement(w1).perform();
		
		// Double click 
		
		act.doubleClick(fld).perform();
	}

}
