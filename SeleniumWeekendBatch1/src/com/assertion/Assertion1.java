package com.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 
{
	@Test
	public void test1()
	{
		String expectedVal = "ABCD";
		String actualVal = "ABCD";
		String actualVal1 = "BDCE";
		Assert.assertSame(actualVal, expectedVal, "Both object are not equal");
		System.out.println("Some Stmt");
		Assert.assertNotSame(actualVal1, expectedVal, "Both Object is Equal");
		Assert.assertSame(actualVal1, expectedVal, "Both Object is not Equal");
		
		System.out.println("Rest of the Stmt");
	}
}
