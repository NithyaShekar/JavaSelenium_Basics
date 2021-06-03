package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.get("https://test.salesforce.com/");//enterURL


//absolute Xpaths are not recomended
//*{@id='headersearchbar']/div/div[2]/table/tbody/tr/td[2]/input
//1.performace issue
//2.not reliable
//3.can be changed at any time in future

driver.findElement(By.xpath("//input[@class='actextbox']")).sendKeys("java");
driver.findElement(By.xpath("//input[@name='query']")).sendKeys("java");
driver.findElement(By.xpath("//input[contains(@class,'actextbox')]")).sendKeys("java");

//dynamic id =input
//id-test_123
//By.id("test_123")

//starts with
//id - test_1344
//id - test_7658
//id - test_789
//id - test_test_567_test

//ends with
//id - 2344_test_t
//id - 766_test_t

driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("java");
driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("java");
driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("java");


//for links:custom xpath
//all the links are represented by <a> html tag
driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();







	}

}
