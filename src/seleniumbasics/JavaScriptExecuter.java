package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.TimeoutException;

public class JavaScriptExecuter {

	public static void main(String[] args) throws IOException {
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nithyashekaregowda@gmail.com");
driver.findElement(By.id("pass")).sendKeys("unnathi02");
//driver.findElement(By.xpath("//input[@id='u_0_a']")).click();

//executeScript -- to execute Javascript code
//
WebElement loginbtn = driver.findElement(By.xpath("//input[@id='u_0_a']"));
flash(loginbtn,driver);
//drawBorder(loginbtn,driver);
////take screenshots and store as a file format
//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////now copy the screenshot to desired location using copyfile//method
//FileUtils.copyFile(src,new File("/C:/Users/HP/Selenium/seljava/src/seleniumbasics/google.png"));
//
////generate alert
//generateAlert(driver,"there is an issue in login page");
//
////click on element by using java executor
//clickElementByJS(loginbtn,driver);
//
////refresh the page:
////1.by using selenium
//driver.navigate().refresh();
////2.by using JS executor
//refreshBrowserByJS(driver);
//
////get title of the page by JS:
//System.out.println(getTitleByJS(driver));

	}
	
//to highlight specific thing
	
	public static void flash(WebElement element,WebDriver driver){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor= element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++){
			changeColor("rgb(0,200,0)",element,driver);//1
			changeColor(bgcolor,element,driver);//2
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+ color +"'", element);
		
		try{
			Thread.sleep(20);
		}
			catch(InterruptedException e){
			}
		}	
//	//to draw a border around the element u want to take screenshot
//	public static void drawBorder(WebElement element,WebDriver driver){
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("argument[0].style.border='3px solid red'", element);
//	}
//	//if we want to indicate the bug in alert with some message
//	public static void generateAlert(WebDriver driver,String message){
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("alert('"+message+"')");
//	}
//
//	//if u want to click on any element using javascript
//	public static void clickElementByJS(WebElement element,WebDriver driver){
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();", element);
//	}
//	
//	//to refresh the page using Java script
//	public static void refreshBrowserByJS(WebDriver driver){
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("history.go(0)");
//	}
//	public static String getTitleByJS(WebDriver driver){
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		String title = js.executeScript("return document.title;").toString();
//		return title;

	}
	
	
