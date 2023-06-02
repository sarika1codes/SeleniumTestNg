package com.practiceautomate.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eighthtestcase {

	public static void main(String[] args) {
		// navigate commands

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		// driver.manage().window().minimize();
		// driver.manage().window().fullscreen();
//		
//	driver.findElement(By.partialLinkText("Create new account")).click();
//		
//		driver.navigate().to("https://amazon.com");
//		driver.navigate().back();
//		driver.navigate().forward();

		// conditional commands

		WebElement email = driver.findElement(By.id("email"));
		// email.sendKeys("sarika.d@gmail");

		WebElement passwrd = driver.findElement(By.id("pass"));
//		passwrd.sendKeys("sarika");

		if (email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("sarika.d@gmail");
			System.out.println("Email is typed in");
		}
		

		if (passwrd.isDisplayed() && passwrd.isEnabled()) {
			passwrd.sendKeys("sarika");
			System.out.println("Password is typed in");
		}
		
			driver.close();
	
	}

}
