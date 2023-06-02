package com.practiceautomate.SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class seventhtestcase {

	public static void main(String[] args) {
		// headless browser testing
		// #1 Using chromeDriver
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		
//		WebDriver driver = new ChromeDriver(options);
		
			
		// #2 Using edge driver
		
//		EdgeOptions optionss = new EdgeOptions();
	//	optionss.addArguments("--headless");
		
	//	WebDriver driver = new EdgeDriver(optionss);
		
		// 	#3 Using HTMLunit driver
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
	
		
		driver.get("https://facebook.com");
		
		String a = driver.getTitle();
		String e = "Facebook";
		
		if (a.startsWith(e))
		{
			System.out.println("It's correct")	;
		}
		else {
			System.out.println("It's incorrect")	;
		}
		
		System.out.println("The title of the webpage is " + a);
		
		
	}

}
