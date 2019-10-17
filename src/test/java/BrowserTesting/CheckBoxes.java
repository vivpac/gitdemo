package BrowserTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {
	public static ChromeDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
			WebElement block=	driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
	      List <WebElement>  checkboxes=block.findElements(By.name("sports"));
	      System.out.println(checkboxes.size());
	      for(WebElement chkbox :checkboxes) 
	      {
	    	  chkbox.click();
	    	  
	    	  
	      }
	      
	}
				

	}


