package BrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id=\\\"fileupload\\\"]")).sendKeys("C:\\Users\\hi\\Downloads\\[FreeTutorials.Eu] Udemy - The Complete WordPress Website Business Course\\testu.txt");

	}

}
