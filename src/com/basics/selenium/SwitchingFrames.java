package com.basics.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		
		
		
		//switching frames
		
		//no of frames in the webpage
		
//		List<WebElement> s = driver.findElements(By.tagName("frame"));
//		Iterator itr = s.iterator();
//		
//		String s1 = (String) itr.next();
//		System.out.println(s1);
		
		
		
		
		
		
		
		
//		WebElement frame1 = driver.findElement(By.xpath("//frame[@name='packageListFrame'][1]"));
		driver.switchTo().frame("classFrame");
//		
		Thread.sleep(1000);
//		
//	WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.xpath("//div[@class='indexHeader']//a[contains(text(),'All Classes')]")))).click();
		
//		
//		driver.findElement(By.linkText("Deprecated")).click();
//		
//		Thread.sleep(1000);
//		
//		WebElement doubleCheck = driver.findElement(By.linkText("Deprecated"));
//		doubleCheck.click();
		
//		
//		
//		driver.findElement(By.xpath("//div[@class='indexHeader']//a[contains(text(),'All Classes')]")).click();
//		
		//switching frames
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='classFrame']")));
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//a[contains(text(),'Deprecated')])[1]")).click();
		
		
		

	}

}
