package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome

//when we are working in different url like google and 
driver.get("http://www.google.com/");//enterURL
driver.navigate().to("http://www.amezon.com/");//both driver.get and driver.navigate().to both is used to launch the page 
//but driver.naviagteT0 is used to launch some external URL. 
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().back();
//how referesh the page
driver.navigate().refresh();
driver.manage().deleteAllCookies();//delete all browser history
//when we use navigate() method, it will automatically holds all browser history.
//so by using browser history we can perform naviagteion operations like back, forward, refresh
driver.manage().window().maximize();

	}

}
