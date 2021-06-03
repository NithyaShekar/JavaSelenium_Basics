package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendraSelect {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver = new ChromeDriver();
driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");

String date="02-September-2017";
String datearr[]=date.split("-");//[02,September,2017]
String day=datearr[0];
String month=datearr[1];
String year=datearr[2];
Select select=new Select(driver.findElement(By.xpath("pass the element of month")));
select.selectByVisibleText(month);
Select select1=new Select(driver.findElement(By.xpath("pass the element of year")));
select.selectByVisibleText(year);
	}

}
