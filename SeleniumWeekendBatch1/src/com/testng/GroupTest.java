package com.testng;

import org.testng.annotations.Test;

public class GroupTest 
{
	@Test(groups={"SmokeTest"})
	public void m1()
	{
		System.out.println("M1");
	}
	
	@Test(groups={"regressionTest"})
	public void m2()
	{
		System.out.println("M2");
	}
	
	@Test(groups={"SmokeTest", "regressionTest"})
	public void m3()
	{
		System.out.println("M3");
	}
	
	@Test(groups={"regressionTest"})
	public void m4()
	{
		System.out.println("M4");
	}
	
	@Test
	public void m5()
	{
		System.out.println("M5");
	}
	
}
