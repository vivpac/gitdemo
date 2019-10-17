package BrowserTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\hi\\eclipse-workspace\\selenium_Testing\\src\\test\\java\\BrowserTesting\\config.properties");
        prop.load(ip);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("Name"));
        System.out.println(prop.getProperty("age"));
        String url=prop.getProperty("URL");
        System.out.println(url);
        //WebDriverManager.firefoxdriver().setup();
        //FirefoxDriver driver=new FirefoxDriver();
       
	}

}
