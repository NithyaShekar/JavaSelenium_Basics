package com.test;

import org.testng.annotations.Test;

public class TestNGDependOn {

	@Test
	public void loginTest(){
		System.out.println("login test");
		int i=9/0;
	}
	//we can use "depends on method" but dependent test case should pass 1st,
	//if dependent case is failed,we cant run any of the testcase 
	@Test(dependsOnMethods="loginTest")
	public void HomePagetest(){
		System.out.println("login test");
	}
	
//	@Test
//	public void SearchApgeTest(){
//		System.out.println("login test");
//	}
}
