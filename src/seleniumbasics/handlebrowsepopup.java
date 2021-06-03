package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlebrowsepopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver = new ChromeDriver();
driver.get("http://html.com/input-type-file/");
//to upload a file we hv to click on browse button, after clicking on browse how will to slect the file
//bcz that popup is window pop up which is a part of OS not browsers,selenium cant understand.
//we cant take xpath of files.we cant switch to window popup using alert class.
driver.findElement(By.xpath("provide xpath of browse/attach/upload etc button")).sendKeys("give file path i.e location");
	}
}
