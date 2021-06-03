package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com");
System.out.println(driver.getTitle());

//handling drop down
Select select=new Select(driver.findElement(By.id("huu")));//any action is not performed like sendkey click
select.selectByVisibleText("entre drop downvalue here");
	}

}
