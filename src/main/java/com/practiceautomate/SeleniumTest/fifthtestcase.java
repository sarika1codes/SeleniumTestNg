package com.practiceautomate.SeleniumTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fifthtestcase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		try {
		driver.findElement(By.id("fake")).click();
		}
		catch (Exception e)
		{
			System.out.println("No such element exists");
		}
		
	
			
		}
		
	}

	


