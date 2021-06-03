package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayreg {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver = new ChromeDriver();
driver.get("https://reg.ebay.in/reg/PartialReg");
Thread.sleep(5000);
System.out.println(driver.getTitle());
//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Nithya");
//driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("shekar");
//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("unnathishekaregowda@gmail.com");
//driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("Unnathi@02");
//
//driver.findElement(By.xpath("//input[@id='ppaFormSbtBtn']")).click();

}
}