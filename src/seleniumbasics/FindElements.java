package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.get("https://facebook.com/");//enterURL

//1. get the total count of links on page
//2. get the text of each link on the page

List <WebElement> linklist=driver.findElements(By.tagName("a"));//all the links are represented by "a"
System.out.println(linklist.size());

//how many inputs
//List <WebElement> linklist1=driver.findElements(By.tagName("input"));
//System.out.println(linklist1.size());

//how many buttons
//List <WebElement> linklist2=driver.findElements(By.tagName("buttons"));
//System.out.println(linklist2.size());

for(int i=0;i<linklist.size();i++){
	String linktext = linklist.get(i).getText();//gettext will come in string lets store it in string 
	System.out.println(linktext);
}
	}
	}
