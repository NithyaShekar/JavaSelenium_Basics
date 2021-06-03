package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1. alerts -- javascript PopUp--Alert API(accept,dismiss)
		//2. File upload popup -- Browse button(type=file,sendKeys(path)
		//3. Browser Window Popup - Advertisement Popup(window Handler  API - getWindowHandles())
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver = new ChromeDriver();
driver.get("http://www.popuptest.com/goodpopups.html");
driver.findElement(By.xpath("//a[@class='black']")).click();
Thread.sleep(2000);
//below driver gives u one set object of string type
///driver.getWindowHandles()
Set<String> handler=driver.getWindowHandles();
//set object will be there whwre 2 window id's are available.
//window id's are available in handler.In set object values are not stored on the basis of index.
//So to get the values from set object we have to use iterator
Iterator<String> it= handler.iterator();//here iterator will be pointing just above the set object
//to fetch values from array or arraylist we hv to for loop,bcz for loop is on the basis of index.
//in set object values are not stored on the basis of indexes 
//it.next();//this will shift the iterator to above the set object to 1st value of set object
String ParentWindowID=it.next();
System.out.println("parent window id = " +ParentWindowID );

//it.next();
String ChildWindowID=it.next();
System.out.println("childwindowid = "+ChildWindowID);//now we got both windows id.
//when we have to swith from parent to child

driver.switchTo().window(ChildWindowID);
Thread.sleep(2000);
System.out.println("childWindowPopup"+driver.getTitle());
driver.close();
//to come back to parent window
driver.switchTo().window(ParentWindowID);
Thread.sleep(2000);
System.out.println("ParentWindowPopUp"+driver.getTitle());
	}
}
