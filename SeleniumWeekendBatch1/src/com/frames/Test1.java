package com.frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://drive.google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
	
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='SampleFolder']")));
	
		WebElement fldWebElm = driver.findElement(By.xpath("//span[text()='SampleFolder']"));
		
		fldWebElm.click();
		
		driver.findElement(By.xpath("(//div[contains(@aria-label,'Share')]/div)[1]")).click();
		
		Thread.sleep(3000);
		
		// Switch to Frame
		
		WebElement frameWebElm = driver.findElement(By.xpath("//iframe[@title='Share with others']"));
		
		driver.switchTo().frame(frameWebElm);
		
		WebElement shrWebElm = driver.findElement(By.xpath("//textarea[@class='apps-share-chips-input']"));
		
		shrWebElm.click();
		shrWebElm.sendKeys("pritam@jdw.com");
		
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
		driver.switchTo().defaultContent();
		
		
	}

}
