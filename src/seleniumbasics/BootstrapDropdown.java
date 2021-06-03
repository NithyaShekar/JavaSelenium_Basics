package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver = new ChromeDriver();
driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
//or===List<WebElement> list=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
	System.out.println(list.size());
//driver.findElement(By.xpath("//label[contains(text(),'Angular')]")).click();
	
	//selecting all the checkbx or options
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i).getText());
		list.get(i).click();
		//we can use isselect method here
	}
	}
	
	//selecting angular option
//	for(int i=0;i<list.size();i++){
//		System.out.println(list.get(i).getText());
//	if(list.get(i).getText().contains("Angular")){
//		list.get(i).click();
//		break;
//	}
//	}

	}

