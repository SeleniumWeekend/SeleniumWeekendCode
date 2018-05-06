package com.testng;

import java.util.Random;

import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void m1()
	{
		createRandumEmailID();
		createRandumEmailID();
		createRandumEmailID();
	}
	
	public void createRandumEmailID()
	{
		Random r1 = new Random();
		int n = r1.nextInt();
		if(n<0)
		{
			n=-n;
		}
		System.out.println("Test"+n+"@jdw.com");
	}
}
