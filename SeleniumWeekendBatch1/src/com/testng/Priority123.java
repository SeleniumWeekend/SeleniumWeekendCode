package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Priority123
{	
	@Parameters({"url", "uname", "pw"})
	@Test
	public void loginToApp(String url, String uname, String pw)
	{
		System.out.println("Pass URL : "+url);
		System.out.println("Enter username : "+uname);
		System.out.println("Enter password : "+pw);
	}
	
	@Parameters({"uname", "pw", "browserName"})
	@Test
	public void createFolder(String uname, String pw, String browserName)
	{
		if(browserName.equals("ie"))
		{
			System.out.println(browserName);
			System.out.println("Enter username : "+uname);
			System.out.println("Enter password : "+pw);
		}
	}
	
}
