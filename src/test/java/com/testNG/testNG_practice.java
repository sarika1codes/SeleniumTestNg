package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_practice {

	
	@BeforeSuite
	
	public void setUp () {
		System.out.println("setup system property for chrome");
	}
		@BeforeClass
	
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeMethod
	
	public void enterUrl () {
		System.out.println("enter URL");
		
	}
	@BeforeTest
	
	public void login () {
		System.out.println("login to app");
	
	}	
		@Test (invocationCount=5, timeOut=300)
		
			
		public void invoTest () {
			
			int a = 1;
			int b =10;
			int c = a+b;
			
			System.out.println("Sum of c is: " + c);
			
			int i = 1;
			while(i==1)
				System.out.println("Sum of c is: " + c);
		
}
		@AfterMethod
		
		public void logout () {
			System.out.println("logoutfrom app ");
		
		}
		
	@AfterTest
	
	
	public void deleteCookies () {
		System.out.println("delete all cookies");
	}
	
	@AfterClass
	
	public void closeBrowser () {
		System.out.println("close the browser");
}
	
	@AfterSuite
	
	public void generateReport () {
		System.out.println("genrate test report");
	}
}
