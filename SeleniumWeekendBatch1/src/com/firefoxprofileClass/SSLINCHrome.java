package com.firefoxprofileClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLINCHrome 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumProject\\Server\\IEDriverServer.exe");
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.get("https://www.cacert.org/");
	}
}
