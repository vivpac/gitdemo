package BrowserTesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngLearning {

	
	
	@BeforeTest
	public void CreateDbConn()
	{
		
		System.out.println("CreateDbConn ");
	}

	@AfterTest
	public void CloseDbConn()
	{
		
		System.out.println("CloseDbConn ");
	}
	@Test(priority=1)
	public void doUSerTeg()
	{
		
		System.out.println("Excecuting reg num");
	}
	@AfterMethod
	public void closeBrowser()
	{
		
		System.out.println("Closing the browser");
	}
	@Test(priority=2)
	public void doLogin()
	{
		
		System.out.println("user is loginsuccessfull");
	}
	
	
}
