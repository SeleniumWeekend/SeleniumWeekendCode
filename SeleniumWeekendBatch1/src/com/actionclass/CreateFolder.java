package com.actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateFolder
{
	public static WebDriver driver;
	public static Actions act ;
	public static List<WebElement> lst1;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://drive.google.com");
		System.out.println("");
		List<WebElement> lst = driver.findElements(By.xpath("(//a[text()='Go to Google Drive'])[2]"));
		
		if(lst.size()>0)
		{
			driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]")).click();
		}
		Thread.sleep(4000);
		
		act = new Actions(driver);
		
		act.sendKeys("seleniumweekend").perform();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(4000);
		
		
		act.sendKeys("Abcd@123").perform();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(7000);
		
		// Verify whether the folder is present or not
		// if Present delete the folder first then create
		lst1 = driver.findElements(By.xpath("//span[text()='SampleFolder']"));
		
		if(lst1.size()>0)
		{
			driver.findElement(By.xpath("//span[text()='SampleFolder']")).click();
			// Delete the folder
			driver.findElement(By.xpath("//div[@aria-label='Remove']")).click();
			createFolder();
		}
		else
		{
			createFolder();
		}
	}
	
	public static void createFolder() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement newBtn = driver.findElement(By.xpath("(//div[text()='New'])[1]"));
		act.moveToElement(newBtn).click(newBtn).perform();
		Thread.sleep(2000);
		WebElement fldWebElm= driver.findElement(By.xpath("//div[text()='Folder']"));
		fldWebElm.click();
		act.sendKeys("SampleFolder").perform();
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		List<WebElement> lst2 = driver.findElements(By.xpath("//span[text()='SampleFolder']"));
		if(lst2.size()>0)
		{
			System.out.println("Floder is created successfully");
		}
		else
		{
			System.out.println("Floder is not created");
		}
	}
}
