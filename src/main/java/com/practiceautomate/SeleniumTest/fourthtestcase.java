package com.practiceautomate.SeleniumTest;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourthtestcase {

	public static void main(String[] args) throws AWTException {
		//using xpath
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Cream");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		// download chropath - extension that gives both absolute and relative xpath when we click.. inspect>element
		
		
	
		
	
	
	}

}
