package seleniumbasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locaters {
	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com");
System.out.println(driver.getTitle());
//xpath--2 
//hierarcy is not good to use.Only direct xpaths can be used
//absolute xpath should not be used--    html/body/div[1]/div[5]/div[2]/a
//only relative xpath should be used--- //*[@id="id value"]
driver.findElement(By.xpath("hgfjdd")).sendKeys("hi");
//ID--
driver.findElement(By.id("fakebox-input")).sendKeys("hii");
driver.findElement(By.id("fakebox-microphone")).sendKeys("hoo");
//name
driver.findElement(By.name("name")).sendKeys("ji");
//link text:this only for links
driver.findElement(By.linkText("--")).click();

//partial link text
driver.findElement(By.partialLinkText("partialLinkText")).click();
//css selector//id followed by # is a css selector--3
//if id is there--#(id)
//if class is there ---.(class)
driver.findElement(By.cssSelector("#fakebox-input")).sendKeys("hii");

//class name:class name can be duplicate so not recommended to use class name
driver.findElement(By.className("hffgh")).click();
}
}