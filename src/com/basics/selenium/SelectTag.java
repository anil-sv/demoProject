package com.basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select fruties = new Select(driver.findElement(By.id("fruits")));
		fruties.selectByIndex(0);
		fruties.selectByValue("grape");
		fruties.selectByVisibleText("Apple");
		
		if(fruties.isMultiple() == true) {
			System.out.println("yes");
		}else
			System.out.println("Nope");
		
		fruties.deselectAll();
		
		
		
//		String title = driver.getTitle();
//		System.out.println(title);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,400)");
//		
//		Select country = new Select(driver.findElement(By.name("country")));
//		country.selectByVisibleText("GREECE");
		
//		WebElement sub = driver.findElement(By.name("submit"));
//		sub.submit();
//		
		
		
		
		
		
		
		
		
		
		

	}

}
