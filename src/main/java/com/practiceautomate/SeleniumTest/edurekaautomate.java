package com.practiceautomate.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class edurekaautomate {
	public static String browser = "Edge";
	public static void main(String[] args) {
		
		// to open on either "edge" or  "chrome" browser
		WebDriver driver = null;
		if (browser.equals("Edge"))
		
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Edge is running");
		}
		
		else if (browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		System.out.println("Chrome is running");
				}
		else {
			System.out.println("Out of options");
			
		}
		
	
	
		
		driver.get("https://edureka.co");
		driver.manage().window().maximize();
		
		
			
		 driver.findElement(By.className("signup_click")).click();
		
		
		if(driver.findElement(By.className("signup-vd")).isDisplayed());
		System.out.println("The test has passed");
		

			

		driver.findElement(By.xpath("//input[@id='sg_popup_email']")).sendKeys("sara.dengle@gmail.com");
	}


}
