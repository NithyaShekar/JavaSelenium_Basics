package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {
//	@BeforeSuite setup system property from chrome ------I
//	@BeforeTest launch chrome browser -----2
//	@BeforeClass login button -----3
	
//	@BeforeMethod enter URL  ---4
//	@Test google logo test --5
//	@AfterMethod logout from app --6
	
//	@BeforeMethod enter URL  --4
//	@Test google title test  --5
//	@AfterMethod logout from app --6
	
//	@BeforeMethod enter URL --4
//	@Test serach test --5
//	@AfterMethod logout from app --6
	
//	@AfterClass close browser --7 
//	@AfterTest delete all cookies --8
	
	//annotations are
	//each and every annotation should be associated with one method.
	//Each and every annotation should start with @
	//TestNG class is divided into 3 sections.
	
	//Section 1--- PreCondition annotations -- starting with @Before
	
	@BeforeSuite//1
	public void setUp(){
		System.out.println("@BeforeSuite setup system property from chrome");
	}
	@BeforeTest//2
	public void launchBrowser(){
		System.out.println("@BeforeTest launch chrome browser");
	}
	
	@BeforeClass//3
	public void login(){
		System.out.println("@BeforeClass login button");
	}
	/*
	 * login button
enter URL  --@BeforeMethod
google title test --@Test 1
logout from app --@AfterMethod

enter URL --@BeforeMethod
serach test --@Test 1
logout from app --@AfterMethod
	 */
	
	@BeforeMethod//4
	public void enterURL(){
		System.out.println("@BeforeMethod enter URL");
	}
	//Section 2--- test cases -- starting with @Test--------this is used to insert our test cases.
	//We can include "n" number of testcases
	@Test//5
	public void googletitletest(){
		System.out.println("@Test google title test");
	}
	@Test//5
	public void searchTest(){
		System.out.println("@Test serach test");
	}
	@Test//5
	public void googlelogotest(){
		System.out.println("@Test google logo test");
	}
	//Section 3--- Post conditions -- starting with @After
	@AfterMethod//6
	public void logout(){
		System.out.println("@AfterMethod logout from app");
	}
	@AfterTest//8
	public void deleteAllCookies(){
		System.out.println("@AfterTest delete all cookies");
		}
	@AfterClass//7
	public void closeBrowser(){
		System.out.println("@AfterClass close browser");
	}
	@AfterSuite//9
	public void generateTestReport(){
		System.out.println("@AfterSuite generate test Report");
	}
}
