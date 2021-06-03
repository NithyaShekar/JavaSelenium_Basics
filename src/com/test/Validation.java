package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validation {
	WebDriver driver;
@BeforeMethod   //precondition
public void setUp(){
String key = "webdriver.chrome.driver";
String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.google.com");

}


@Test
public void googleTitletets(){
	String str= driver.getTitle();
	System.out.println(str);
Assert.assertEquals(str, "Google");
}
@Test
public void googlelogoTest(){
	boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	Assert.assertEquals(b, true);
	//Assert.assertTrue(b);
}

@AfterMethod //post condition	
public void tearDown(){
	driver.quit();
}
}
