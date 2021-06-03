package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.get("http://half.ebay.com/");//enterURL

driver.manage().window().maximize();
driver.manage().deleteAllCookies();


//dynamic waits, do not wait until the give time is reached.
//Perform next action immediatly after pageload or elements are laoded

//when page takes lots of time to load.
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

//few time page is loaded but elements are not loaded, then perform implicitly wait
//implicitly wait is for all the elements on the page.
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);




	}

}
