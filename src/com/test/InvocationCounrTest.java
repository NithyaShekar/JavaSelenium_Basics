package com.test;

import org.testng.annotations.Test;

public class InvocationCounrTest {

	//when we want to repeat same scenario multiple times
	@Test(invocationCount=10)
	public void sum(){
		int a=10;
		int j=20;
		int c= a+j;
		System.out.println("sum is==" +c);
	}
}
