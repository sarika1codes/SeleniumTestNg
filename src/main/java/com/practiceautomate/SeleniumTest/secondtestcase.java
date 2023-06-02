package com.practiceautomate.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondtestcase {

	public static void main(String[] args) throws InterruptedException {
		
//		System.getProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("sara.dengle@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(1000);
		
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if (at.equalsIgnoreCase(et)) 
		{
			System.out.println("Test sucessfull");
		}
		else {
			System.out.println("Test failed");
		}

	}

}
