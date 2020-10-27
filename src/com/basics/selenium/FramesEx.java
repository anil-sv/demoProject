package com.basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesEx {

	public static WebElement alert;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.simplilearn.com/know-about-testng-annotations-in-selenium-webdriver-article");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	//	Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a[@class='close']"));
		
		
		
		
		WebDriverWait w = new WebDriverWait(driver,40);
		
	if(ele.isDisplayed()) {
		
		w.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		}
	
	else {
		
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		//multiple frames
		
		List <WebElement> lis = driver.findElements(By.tagName("iframe"));
		int length = lis.size();
		System.out.println(length);
		
		
		WebElement wantedFrame = driver.findElement(By.xpath("//iframe[@id='webpush-onsite']"));
		for(int i = 0; i < lis.size(); i++) {
			lis.get(i).getAttribute("name");
			if(lis.get(i).getAttribute("name").equalsIgnoreCase("webpush-onsite")) {
				//lis.get(i).getAttribute("name")
				
				driver.switchTo().frame(wantedFrame);
				WebElement allow = driver.findElement(By.id("allow"));
				allow.click();
				
				
			}
			
		}
		
	}
	}
}
		//switch to frame
		
		
		
		
		
		
	


