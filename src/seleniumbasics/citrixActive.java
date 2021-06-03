package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class citrixActive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.get("http://half.ebay.com/");//enterURL
driver.findElement(By.xpath("//a[contains(text(),'Brand Outlet')]")).click();
Thread.sleep(3000);
boolean b1=driver.findElement(By.xpath("//input[@id='gh-ac']")).isDisplayed();
while (b1=true){
driver.findElement(By.xpath("//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Brand Outlet')]")).click();
	}
	}
}
