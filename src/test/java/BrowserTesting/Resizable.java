package BrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(1);
		
		WebElement Resizable=driver.findElement(By.xpath("//*[@id=\\\"resizable\\\"]/div[3]"));
        Actions action=new Actions(driver);
        action.dragAndDropBy(Resizable, 400, 300).perform();
        
        

	}

}
