package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
		//System.setProperty("webdriver.chorme.driver","C:/Users/HP/Selenium/seljava/Softwares/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("filename")).sendKeys("****put***file location");
		
	}

}
