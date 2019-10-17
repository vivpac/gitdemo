package TestCase;


import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void setUp() {
		
		Reporter.log("hello");
		System.out.println("Creating DB Conn");
		//System.out.println("Launching browser");
	}
	
	@AfterTest
	public void closeDbConn() {
		
		System.out.println("Closing db conn");
		//System.out.println("Closing the browser");
	}
	
	
	@BeforeMethod
	public void launchingBrowser() {
		
		System.out.println("Launching browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Closing the browser");
	}
	
	@Test(priority=1)
	public void userRegTest() {
		
	
		System.out.println("Executing User Reg test");
	}
	
	@Test(priority=2)
	public void loginTest() {
		
		System.out.println("Executing login test");
	}

	
	

	
}
