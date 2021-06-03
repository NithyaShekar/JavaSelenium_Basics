     package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver"; 
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.get("http://www.facebook.com/");//enterURL
//1. isDisplayed() method:applicable for the elements
boolean b1=driver.findElement(By.xpath("//input[@id='u_0_a']")).isDisplayed();
System.out.println(b1);

//2.isEnabled() method
boolean b2=driver.findElement(By.xpath("//input[@id='u_0_a']")).isEnabled();
System.out.println(b2);//false

//select i agree check box
driver.findElement(By.name("agreeTerms")).click();
boolean b3=driver.findElement(By.xpath("//input[@id='u_0_a']")).isEnabled();
System.out.println(b3);//true

//3.isSelected() method only applicabel for checkbox,dropdown,radiobutton
boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
System.out.println(b4);//true

//de-selected the checkbox
driver.findElement(By.name("agreeTerms")).click();
boolean b5=driver.findElement(By.name("agreeTerms")).isSelected();
System.out.println(b5);//false
	}
}
