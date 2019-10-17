package BrowserTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandingPopup {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().setPosition(targetPosition);
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Set<String> handler=driver.getWindowHandles();
	    Iterator<String>  it=handler.iterator();
	    
	    String ParentWindow=it.next();
	    System.out.println("Parent_Id" +ParentWindow);
	    
	    String ChildWindow=it.next();
	    System.out.println("Child_Id" +ChildWindow);
	    driver.switchTo().window(ChildWindow);
	    System.out.println("Child window title" +driver.getTitle());
	    driver.close();
	    driver.switchTo().window(ParentWindow);
	    System.out.println("Parent window  title"+driver.getTitle());
	    
	    

	}

}
