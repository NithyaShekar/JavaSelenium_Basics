package seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.get("http://www.google.com/");//enterURL

//take screenshots and store as a file format
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//now copy the screenshot to desired location using copyfile//method
FileUtils.copyFile(src,new File("/C:/Users/HP/Selenium/seljava/src/seleniumbasics/google.png"));
	}
}
