package com.basics.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/popup.php");
		//alert
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String>s = driver.getWindowHandles();
		Iterator itr = s.iterator();
		String parentWindow = null;
		String childWindow = null;
		
		while(itr.hasNext()) {
            parentWindow = (String) itr.next();
			childWindow = (String) itr.next();
			System.out.println(parentWindow);
			System.out.println(childWindow);
		}
		
		driver.switchTo().window(parentWindow);
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Guru99ProvidesInformativeTutorials@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).submit();
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Guru99 Bank Home Page")) {
			System.out.println("we landed at the correct page");
		}else
			System.out.println("sorry not allowed");
		
		driver.switchTo().window(parentWindow);
	
//		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234567");
//		driver.findElement(By.xpath("//input[@name='submit']")).submit();
//		
//		driver.switchTo().alert().accept();
		
	//	driver.switchTo().alert().accept();
		//actions class --- to handle mouse hover and keyboard events
		
		
//		WebElement xpath = driver.findElement(By.xpath("//a[@href='' or @title='Software Testing']"))
		
		
//		WebElement uplaod = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
//		
//		uplaod.sendKeys("C:\\Users\\91836\\Desktop\\InterviewPreparation\\Use TestNG Annotations in Selenium (with Examples).pdf");
//		
//		Actions act = new Actions(driver);
//		WebElement text = driver.findElement(By.xpath("//input[@name='userName']"));
//		act.moveToElement(text).keyDown(text,Keys.SHIFT).sendKeys(text,"hello").doubleClick().contextClick().build().perform();
//		
		
//		WebElement flights = driver.findElement(By.xpath("//a[contains(text(),'Flights')]"));
//		WebElement bgCol = driver.findElement(By.xpath("(//a[contains(text(),'Flights')]/ancestor::td)[4]"));
//		bgCol.getCssValue("flights");
//		
//		String bgCol = driver.findElement(By.xpath("//input[@name='submit']")).getCssValue("style");
//		System.out.println(bgCol);
//		
		
//		act.moveToElement(flights).build().perform();
//		act.click();
//		String title = driver.getTitle();
//		System.out.println(title);
//		Thread.sleep(1000);
		
		
//		driver.get("http://demo.guru99.com/test/newtours/");
//		Thread.sleep(2000);
//		Actions act2 = new Actions(driver);
//		WebElement vacations = driver.findElement(By.xpath("//a[contains(text(),'Vacations')]"));
//		act2.moveToElement(vacations).build().perform();
////		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOf(vacations));
////		act2.click();
//		vacations.click();
//		String title2 = driver.getTitle();
//		System.out.println(title2);
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.linkText("click here")).click();
//		
//		driver.get("http://demo.guru99.com/test/link.html");
//		Thread.sleep(1000);
//		driver.findElement(By.partialLinkText("click")).click();

	}

}
