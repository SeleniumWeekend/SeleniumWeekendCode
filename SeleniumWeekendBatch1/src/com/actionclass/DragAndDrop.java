package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Thread.sleep(4000);
		
		WebElement source = driver.findElement(By.xpath("(//span[text()='Thrillers'])[1]"));
		
		WebElement dest = driver.findElement(By.xpath("(//span[text()='History'])[2]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, dest).perform();
		
		
		Action act1 = act.clickAndHold(source).moveToElement(dest).release(dest).build();
		act1.perform();
		
		
	}
}
