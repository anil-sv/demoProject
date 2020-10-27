package com.basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//waits
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.google.com/");
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		String title4 = driver.getTitle();

		System.out.println(title4);
		
		driver.quit();
	}

}
