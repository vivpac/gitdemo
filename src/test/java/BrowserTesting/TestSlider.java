package BrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/");
		int width=driver.findElement(By.xpath("//*[@id=\"slider\"]")).getSize().width;
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
         new Actions(driver).dragAndDropBy(slider, width/2, 0).perform();	
        

	}

}
