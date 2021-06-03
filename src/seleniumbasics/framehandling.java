package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver = new ChromeDriver();
driver.get("freecrm.com");
driver.findElement(By.name("CP")).sendKeys("username");
driver.findElement(By.name("CP")).sendKeys("pswd");
driver.findElement(By.xpath("//input[@type='submit']")).click(); 
Thread.sleep(3000);


driver.switchTo().frame("mainpanel");

//How to handle?//we have to switch from page to frame before -->then perform below action
driver.findElement(By.xpath("//a[contains(test(),'Contacts')]")).click();//this will give no such element exception


//Frame method is overloaded may be string(frame name) or integer(frame index)
//Bcz contact field is a frame, Right click on it to confirm and view page source.
//Note:If u get no such elements,90% chances of having frames.
// how to find out the frame exists, right click on that particular object -- You will find an option "This frame"
// To view frame Go to -- View page source -- search for frame -(if iframe found (frame is available on page)
//frame properties are index and name , Index may be (0,1,2,...) and name varies(check in pagesource)
	
	//Hierarchy -- Browser -> Page -> Frame.
	}

}
