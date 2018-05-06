package com.firefoxprofileClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class AddExtension {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\geckodriver.exe");
		
		FirefoxProfile fp = new FirefoxProfile();
		
		// Path of the plugin
		
		File file = new File("Path of the plugin");
		
		fp.addExtension(file);
		fp.setPreference("extension.flash.currentVersion", "Version of the plugin");
		
		WebDriver driver = new FirefoxDriver();
		
	}

}
