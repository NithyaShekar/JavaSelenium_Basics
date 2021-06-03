package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLunitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
//how to run a script without openining the browser
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
//WebDriver driver=new ChromeDriver();//launching chrome

//Advantages
//1. testing is happening behind the scene - no browser is launched
//2. Very fast - execution of the test cases -- very fast -- performance of the script
//3. not suitable for actions class--user actions -- mousemovements, doubleclic,drag and drop
//4. Ghost Driver --Headless Browser
          //-- Headless Driver --JAva
         //--PhantonJS -- JavaScript

WebDriver driver = new HtmlUnitDriver();

//html unit driver is not available in selenium 3.x version
//htmlunitdriver -- to use this concept we have to download htmlunitdriver JAR file.
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("http://www.facebook.com/");//enterURL

System.out.println("before login title = " + driver.getTitle());

driver.findElement(By.name("username")).sendKeys("naveen");//username
driver.findElement(By.name("password")).sendKeys("test@123");//password
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(2000);

System.out.println("after login title = " + driver.getTitle());
	}
}
//To print only on the console and when we dont want to launch the browser. we use headless driver.