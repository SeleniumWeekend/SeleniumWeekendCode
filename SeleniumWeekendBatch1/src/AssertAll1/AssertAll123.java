package AssertAll1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAll123 
{
	@Test
	public void test1()
	{
		System.out.println("Test Start");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("ABCD", "BDCE", "Both are not equal1");
		System.out.println("STMI1");
		sa.assertTrue(false, "FAIL1");
		System.out.println("stmt 2");
		sa.assertTrue(true, "PASS");
		sa.assertSame("ABCDE", "BCDE", "Both object is not same");
		System.out.println("Other Stmt");
		sa.assertAll();
	}
}
