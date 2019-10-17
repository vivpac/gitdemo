package TestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase2 {
	
	
	@Test
	public void validateTitles() {
		
		String actual = "Gmail.com";
		String expected = "Yahoo.com"; 
		System.out.println("Beginning");
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actual, expected);
		softAssert.assertTrue(false,"button not present");
		softAssert.fail("Failing the test as the condition is not met");
		softAssert.assertTrue(true);
		System.out.println("Ending");
		
		softAssert.assertAll();
		
		
		
		/*if(actual.equals(expected)) {
			
			System.out.println("Test case pass");
		}else {
			
			System.out.println("Test case fail");
		}*/
	}

}
