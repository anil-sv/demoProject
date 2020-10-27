package com.basics.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement checkBtn = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		String value = checkBtn.getAttribute("value");
		System.out.println(value);
		checkBtn.click();
		
		
		//select all the radio buttons
		
		List <WebElement> lis = driver.findElements(By.xpath("//input[@type='radio']"));
		int size = lis.size();
		System.out.println(size);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(lis.get(i).getAttribute(value));
			lis.get(i).click();
		}

		
	}

}
