package com.basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		WebElement image = driver.findElement(By.xpath("//img[@src='/images/logo/logo_v1.png']"));
		if(image.isDisplayed() == true) {
			System.out.println("image is displayed");
			image.click();
			
		}else
			System.out.println("image is not displayed");
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		if(title2.equalsIgnoreCase("Meet Guru99 - Free Training Tutorials &amp; Video for IT Courses")) {
			
			System.out.println("We are on the right page");
			
		}else
			System.out.println("check your code dude");
		
//		List <WebElement> lis = driver.findElements(By.name("webform"));
//		int size = lis.size();
//		
//		for(int x = 0; x <size; x++) {
//			
//			lis.get(x).click();
//		}
		
//		
//		WebElement checkBox = driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
//		checkBox.click();
//		
//		if(checkBox.isSelected()==true) {
//			System.out.println("checkbox is selected");
//		}else
//			System.out.println("checkbox isn't selected");
//		

	}

}
