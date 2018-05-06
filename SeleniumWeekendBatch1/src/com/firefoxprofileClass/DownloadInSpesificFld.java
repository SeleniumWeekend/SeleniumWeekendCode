package com.firefoxprofileClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadInSpesificFld 
{
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\geckodriver.exe");
		
		FirefoxProfile fp = new FirefoxProfile();
		
		// Change the native setting to download in the specific Folder 
		fp.setPreference("browser.download.folderList", 2);
		
		
		fp.setPreference("browser.download.dir", "Path of the folderr");
		
		// Change the native setting to not show the download pop up by using MIME type
		fp.setPreference("browser.helperApps.naverAsk.saveToDisk", "application/java-archive");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/download/");
		
		driver.findElement(By.xpath("(//p[contains(text(),'Download version ')]//following::a)[1]")).click();
		
	}
	
}
