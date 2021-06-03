package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
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


@Test(priority=1,groups="title")
public void googleTitletets(){
	String str= driver.getTitle();
	System.out.println(str);
}


@Test(priority=2,groups="logo")

public void googlelogoTest(){
	boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
}
@Test(priority=3,groups="link")
public void gmaillinkTest(){
	boolean b1=driver.findElement(By.linkText("Gmail")).isDisplayed();
}
@Test(priority=4,groups="test")
public void test(){
	System.out.println("test1");
}
@Test(priority=5,groups="test")
public void test1(){
	System.out.println("test1");
}
@Test(priority=6,groups="test")
public void test2(){
	System.out.println("test1");
}



@AfterMethod //post condition	
public void tearDown(){
	driver.quit();
}














}
