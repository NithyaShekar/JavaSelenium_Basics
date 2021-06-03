package seleniumbasics;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopuphandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//we cant use firebug and firepath to handle popups
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver = new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//input[@name='proceed']")).click();//clicking on Go button,pop will come
Thread.sleep(5000);

//get txt of the pop up and then ok we have to do.there are 2 screeen one is background 
//and one is for popup window.now the contorl is in background screen.
//Now we have to switch our control to popup window.we hv to use below method.

Alert alt= driver.switchTo().alert();//now control is in popup window
alt.getText();
System.out.println(alt);
String text=alt.getText();
if(text.equals("Please enter a valid user name")){
	System.out.println("correct alert is displaying");//test case is pass
}
else
{
	System.out.println("popup alert is incorrect");//test case is fail
}
alt.accept();//click on OK BUTTON
//alt.dismiss();//click on cancel button
	}
}
