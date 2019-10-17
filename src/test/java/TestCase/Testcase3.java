package TestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testcase3 {
	
	
	@Test(priority=1)
	public void userRegTest() {
		
		System.out.println("Executing User Reg test");
		Assert.fail("Submit button missing and the user is not registered");
		
	}
	
	@Test(priority=2,dependsOnMethods= "userRegTest")
	public void loginTest() {
		
		System.out.println("Executing login test");
	}

	
	@Test(priority=3)
	public void isSkip() {
		
		throw new SkipException("Skipping the test as the condition is not met");
	}
}
