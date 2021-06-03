package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemomnt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http://spicejet.com/");//enterURL
//driver.get("http://html.com/input-type-file");

//when we hv to mouse over and later options will be visible later perform actions
//mouse momnets operation is performed by Action class
Actions act= new Actions(driver);  
act.moveToElement(driver.findElement(By.className("link"))).build().perform();//this perform mouseover on perticular element
Thread.sleep(30000);
driver.findElement(By.id("--sub option value")).click();
	}
}


  //aassignment - do multilevel mouse over program.


