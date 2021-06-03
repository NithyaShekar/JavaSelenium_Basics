package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.manage().window().maximize();
//driver.manage().deleteAllCookies();
driver.get("http://jqueryui.com/droppable/");//enterURL
//if a drag and drop thing is present inside the frame. identify the if frame is present
//by clicking on View page source. and how many frames r present.
driver.switchTo().frame(0);//giving 0 bcz only one frame is present.only if frame is present.
Actions act=new Actions(driver);
act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
	}

}
//Actions class is used to perform mouse movements
//When action class is used -- release().build().perform() is must