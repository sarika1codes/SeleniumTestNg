package com.testNG;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver; 
	
	@BeforeMethod
	
	public void setUp() {
	driver = new ChromeDriver(); //launch chrome
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://google.com");
	}
	@Test
	public void titleTest() {
		driver.getTitle();
	String act_title = driver.getTitle();
	System.out.println("The title is " + act_title);
	}
	 @Test (priority =1 )
	 public void logoTest() throws InterruptedException  {
		 boolean b = driver.findElement(By.xpath("//*[@class='lnXdpd']")).isDisplayed();
		 System.out.println("Result is = " + b);
		 Thread.sleep(3000);
	 }
	
	 @Test (dependsOnMethods = "logoTest")
	 public void searchText() throws InterruptedException {
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("TestNG");
		 Thread.sleep(3000);
		 		 }
	 
		 
	@AfterMethod
	 public void closeTab()
	{
		driver.quit();
	}
	
}
	


