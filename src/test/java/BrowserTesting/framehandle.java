package BrowserTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");

		driver.manage().window().maximize();
		// driver.switchTo().frame("iframeResult");
		// driver.findElement(By.xpath("/html/body/button")).click();;
		List<WebElement> fr = driver.findElements(By.tagName("iframe"));
		System.out.println(fr.size());
		for(WebElement fram :fr)
		{ 
			System.out.println(fram.getAttribute("id"));
		}
		
	}

}
