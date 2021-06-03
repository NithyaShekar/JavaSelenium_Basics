package seleniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertyFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//to read the properties we need to create a object of the "Properties" class
		Properties prop= new Properties();
		FileInputStream ip= new FileInputStream("C:/Users/HP/Selenium/seljava/src/seleniumbasics/config.properties");
		//we have to tell where exactly the properties file exist
		prop.load(ip);
		//to read those properties input using keys
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("URL"));
		//or
		String url = prop.getProperty("URL");
	System.out.println(url);
		
		
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		if(browser.equals("Chrome")){
			String key = "webdriver.chrome.driver";
			String value = "./Softwares/chromedriver.exe";
	System.setProperty(key,value);
	driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")){
	System.setProperty("webdriver.firefox.driver","C:/Users/HP/Selenium/seljava/Softwares/geckodriver.exe");
	driver=new FirefoxDriver();
		}
		else if(browser.equals("internerExplorer")){
			System.setProperty("webdriver.firefox.driver","C:/Users/HP/Selenium/seljava/Softwares/internetexplore.exe");
			driver=new InternetExplorerDriver();	
		}
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("emailid_xpath"))).sendKeys(prop.getProperty("emailid"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
