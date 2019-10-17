package BrowserTesting;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hdfcwindowhandles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img")).click();
		
		System.out.println("First window id-----------------------!");
		Set<String> windid = driver.getWindowHandles();
		Iterator<String> iterator = windid.iterator();
		String first_windid = iterator.next();
		System.out.println("First window id" + first_windid);
		

		driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]")).click();
		System.out.println("Second window id-----------------------!");
		windid = driver.getWindowHandles();
		iterator = windid.iterator();
		String Second_windid = iterator.next();
		System.out.println("Seocnd window id" +Second_windid);
		driver.switchTo().window(Second_windid);

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();

		driver.findElement(By.xpath("//*[@id=\"customertab1\"]/div[1]/div[2]/p[5]/strong/a")).click();

		System.out.println("Second window id-----------------------!");
		windid = driver.getWindowHandles();
		iterator = windid.iterator();
		
		String Third_windid = iterator.next();
		System.out.println("Third window id"+Third_windid);
		
		
		//
		System.out.println(driver.getTitle());
		/*
		 * String parentid=it.next();
		 * 
		 * System.out.println("Parent Id"+parentid );
		 * System.out.println(driver.getTitle());
		 * 
		 * String childid=it.next(); String chil=it.next();
		 * driver.switchTo().window(chil);
		 * 
		 * 
		 * System.out.println("Child Id"+chil );
		 * 
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * 
		 * //driver.findElement(By.xpath(""));
		 */ }

}
