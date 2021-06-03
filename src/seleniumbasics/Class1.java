package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nithyashekaregowda@gmail.com");
driver.findElement(By.id("pass")).sendKeys("unnathi02");
String geturl=driver.getCurrentUrl();
System.out.println(geturl);
//driver.findElement(By.)
Dimension dem=new Dimension(200,100);
driver.manage().window().setSize(dem);

	}
}