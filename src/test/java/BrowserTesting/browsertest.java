package BrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("vpvishesh9");
		 driver.findElement(By.cssSelector("#identifierNext > span > span")).click();
		 WebDriverWait wait=new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		 driver.findElement(By.name("password")).sendKeys("rmvivek@12345");
		 driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        
	}
}
