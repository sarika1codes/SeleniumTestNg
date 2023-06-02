package com.practiceautomate.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class firsttestcae {

	public static void main(String[] args) throws InterruptedException { 
		
//		System.getProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
				
		WebDriver driver = new ChromeDriver();
		//opens the url mentioned
		driver.get("https://www.facebook.com/reg");
		// maximizes the webpage on running
		driver.manage().window().maximize();
		
		//to locate the id of the element to change, in this case "day"
		WebElement days = driver.findElement(By.id("day"));
		
		//creating a variable to be to add a new date/day
		Select dayid = new Select(days);
		
		// proccess time/ or time in millisecs to show the changes on screen.
		Thread.sleep(1500);
		
		//changing the date/day as per our wish
		dayid.selectByValue("15");
		
		WebElement months = driver.findElement(By.id("month"));
		Select monthid = new Select(months);
		Thread.sleep(1000);
		monthid.selectByValue("11");
		
		WebElement years = driver.findElement(By.id("year"));
		Select yearid = new Select(years);
		Thread.sleep(1000);
		yearid.selectByValue("1996");

		
		
	
	
	}

}
