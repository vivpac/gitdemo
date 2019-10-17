package BrowserTesting;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {
	public static ChromeDriver driver;
	public static boolean IsElementPresent(String locator)
	{
		try {
	driver.findElement(By.xpath(locator));
	return true;
		}
		catch(Throwable t)
		{
			return false;
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
	    Select select=new Select(dropdown);
	    select.selectByVisibleText("Eesti");
	    //select.selectByValue("hi");
	    
	    List<WebElement> value=driver.findElements(By.tagName("option"));
	    System.out.println("Total number of dropdown" +value.size());
	    /// total number of link in a page
	   
	    List<WebElement>  tlinks=driver.findElements(By.tagName("a"));
	    System.out.println("total link" +tlinks.size());
	    for(WebElement link: tlinks)
	    {
	    	
	    	System.out.println("link text is"+link.getText()+ "link url is" +link.getAttribute("href"));
	    }
	    
	    //find out link in a paticular block 
	    System.out.println("Total number of links");
	 WebElement   block=driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[8]/div[3]"));
     List<WebElement>	links=block.findElements(By.tagName("a"));
     System.out.println("12 link are blow");
     System.out.println("total links count"+links.size());
     System.out.println(block.getText());
     System.out.println(IsElementPresent("//*[@id=\"search-form\"]/fieldset/button/i"));
	
	}

}
