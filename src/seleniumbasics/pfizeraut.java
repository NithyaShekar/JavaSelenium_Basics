package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pfizeraut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();//launching chrome
//pfizer
driver.get("https://test.salesforce.com/");//enterURL
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("agent.ipap@conduent.com.pfizer.pfizeruat");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Conduent#19");
driver.findElement(By.xpath("//input[@id='Login']")).click();

//outlook
//WebDriver driver1=new ChromeDriver();
//driver1.get("https://sts.central.conduent.com/adfs/ls/?client-request-id=17855f7a-ac84-4834-9ee7-17dddd888db5&wa=wsignin1.0&wtrealm=urn%3afederation%3aMicrosoftOnline&wctx=LoginOptions%3D3%26estsredirect%3d2%26estsrequest%3drQIIAXWSz2vTYBzGm3ar25A5xFGPRfSipH3zs0thoO3Wru2SmDVrll5GmrxdfrR5s-TdmvQmOJgHYSeFHTx4EYYnQZD9CTvtPNjFi-JJPHk0293Lw_fw8OXheT5Pc1SJqj5mGZYzKgOBFAyeIVmBAqTB0jzJcAzP0ICyOMCE9xeWprtHhdef2Y0PPwrX18dvv54RBRvjIKqWy5PJpISGQ8eEJRONy98I4pIgfhLEaXYW-uR29ywb8QwvVDiwwq4wAs9wPM2VRG3L7atiok_3sKzuxf0uALq7zm5qDVdSRayP-yNxrHM6rcf6uJfebU9UvURS17G41nD6dQDkphLf-jUl_dF2JE0a9d0WkJpKcpW9J784wDZ9Iyh0pvBPdn6IwvFugCJ8mvtEyAH0W1Yd-T40cenGBn3smAZ2kP8yRAEMsQOjVW4vrni6RYpdbuqK6uFOjZI7trlh0U3XMSKjA5p6L45agd_xFb2i9SaJ6XRFnlMqRr2-kfRswdtH-3CkTTbtemunYbXWzWStq2oRCTWD9HZje9r2yIq7CUOBlBUmTILaYKvd8zphxLFfcvm01jHyL3KLaSjfsYpBiIbOCH7PLfsOthOjFD03kW8dpPlvJricIX7N3AW56tzcwlLmYaaY-TtDfJxNV1wUjjLJuyfy-ftH1ptXy5mL2fJgioJtTNeeSTWu1kxG8aEpiUNDY7e0aEArKuyKtZ7dbsBke5WvUid54iSf_50nju9kzuf_x8DVwoOUHYEEKUigSPFVmqqyfP8f0&cbcxt=&username=nithya.s%40conduent.com&mkt=en-US&lc=");
//driver1.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Change@20");
////driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Conduent#19");
//driver1.findElement(By.xpath("//span[@id='submitButton']")).click();

Select select=new Select(driver.findElement(By.xpath("//button[@class='slds-button slds-p-horizontal__xxx-small slds-button_icon-small slds-button_icon-container'] ")));//any action is not performed like sendkey click
select.selectByVisibleText("Accounts");

	}

}
