package com.practiceautomate.SeleniumTest;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sixthtestcase {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://edureka.co");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Actions builder= new Actions(driver);
	builder.moveToElement(driver.findElement(By.id("mobile_side_menu_triger"))).build().perform();
	Thread.sleep(3000);
	
	WebElement step0 =
	driver.findElement(By.cssSelector("#Software Testing"));
	builder.moveToElement(step0).build().perform();
	Thread.sleep(3000);
	
	WebElement step1 =
	driver.findElement(By.xpath("//input[@id='nav-search-dropdown-card']"));
	builder.moveToElement(step1).build().perform();
	Thread.sleep(3000);
	
	WebElement step2 =
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	builder.moveToElement(step2).build().perform();
	Thread.sleep(2000);
	
	WebElement step3 =
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	builder.moveToElement(step3).build().perform();
	Thread.sleep(2000);
	
	WebElement step4 =
	driver.findElement(By.xpath("//input[@class='Baby & Expecting']"));
	builder.moveToElement(step4).build().perform();
	Thread.sleep(2000);
	
	Actions seriesOfActions;
	seriesOfActions = builder;
	
	
	step0.click();
	step1.click();
	step2.sendKeys("Happy Birthday");
	step3.click();
	step4.click();

	seriesOfActions.build().perform();


	
	// unable to run
	
	}	
	
}
