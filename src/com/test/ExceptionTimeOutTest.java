package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

//	
//	@Test(timeOut=500)
//	public void infiniteloopTest(){
//		int i=1;
//		while(i==1){
//			System.out.println(i);
//		}
//	}
//	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test(){
		String u= "100A";
				Integer.parseInt(u);
	}
}
