package com.basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/table.html");
		
		List<WebElement>lis = driver.findElements(By.xpath("//tbody/tr"));
		
		int rows_count = lis.size();
		System.out.println(rows_count);
		
		for(int i = 0; i <rows_count;i++) {
		        String n = lis.get(i).getText();
		        System.out.println(n);
		        
		        
		    
		}
		
		
		
		
		
		
		

	}

}
