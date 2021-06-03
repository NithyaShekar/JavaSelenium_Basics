package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class societynightouts {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
driver.get("https://www.facebook.com");//enterUL

driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("unnu");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("unn12");
driver.findElement(By.xpath("//input[@type='text' and @data-type='text' and @id='u_0_q']")).sendKeys("8951188553");
driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("unnathi02");
WebElement wb=driver.findElement(By.id("day"));
Select sel=new Select(wb);
sel.selectByVisibleText("23");

WebElement wb1=driver.findElement(By.id("month"));
Select sel1=new Select(wb1);
sel1.selectByVisibleText("Jan");

WebElement wb2=driver.findElement(By.id("year"));
Select sel2=new Select(wb2);
sel2.selectByVisibleText("1998");

driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']")).click();
Thread.sleep(5000);
Alert alt=driver.switchTo().alert();
alt.getText();
System.out.println(alt);
String text=alt.getText();

if(text.equals("WWW.facebook.com wants to Show notifications"))
{
	System.out.println("correct");
}
else
{
	System.out.println("not correct");
}

alt.accept();




	}

}
