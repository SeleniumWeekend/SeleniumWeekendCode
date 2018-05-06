package com.testng;

class WebDriver
{
	void get(String url)
	{
		System.out.println(url);
	}
}

class FirefoxDriver extends WebDriver
{
	void get(String url)
	{
		System.out.println("Pass url in Firefox : "+url);
	}
}

class ChromeDriver extends WebDriver
{
	void get(String url)
	{
		System.out.println("Pass url in Chrome : "+url);
	}
}

public class Test2
{
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}
}
