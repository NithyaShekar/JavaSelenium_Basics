package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.manage().window().maximize();
driver.get("http://www.google.com/");//enterURL
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sb11']"));
System.out.println("total"+list.size());
	}
}
