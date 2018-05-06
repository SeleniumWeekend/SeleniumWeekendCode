package com.autoit;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://drive.google.com");
		System.out.println("");
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
		
		
		act.sendKeys("Abcd@123").perform();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(7000);

		WebElement newBtn = driver.findElement(By.xpath("(//div[text()='New'])[1]"));
		act.moveToElement(newBtn).click(newBtn).perform();
		Thread.sleep(2000);
		WebElement fileUploadWebElm= driver.findElement(By.xpath("//div[text()='File upload']"));
		fileUploadWebElm.click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("F:\\AUTOIT\\MultipalFile.exe"+" "+"F:\\ABC\\Run2.java");
	
		Thread.sleep(2000);
		act.moveToElement(newBtn).click(newBtn).perform();
		Thread.sleep(2000);
		fileUploadWebElm.click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("F:\\AUTOIT\\MultipalFile.exe"+" "+"F:\\ABC\\Run5.java");
	}

}
