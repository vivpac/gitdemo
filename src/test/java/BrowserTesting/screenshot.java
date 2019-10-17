package BrowserTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
         driver.get("https://jqueryui.com/droppable/");
     	File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     	FileUtils.copyDirectory(src, new File("C:/Users/hi/eclipse-workspace/selenium_Testing/src/test/java/BrowserTesting/kk.png"));
//		
	
		
				

			
	
	}

}
