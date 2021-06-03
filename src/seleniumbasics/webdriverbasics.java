package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//chrome browser:
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.get("https://www.google.com");//enterURL

String title= driver.getTitle();
System.out.println(title);//print page title on console
//check the opened page is correct.
if(title.equals("Google")){
	System.out.println("correct title");
	}
else{
	System.out.println("incorrect title");
	}
System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());

//everytime on launching a URL duplicate page of chrome will open
//driver.quit();//close all the windows opened by webdriver
//driver.close();// close current window
	}
}
