package com.firefoxprofileClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Test2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\geckodriver.exe");
		
		FirefoxProfile fp = new FirefoxProfile();
		
		fp.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cacert.org/");
	}

}
