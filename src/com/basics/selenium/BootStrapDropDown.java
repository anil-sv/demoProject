package com.basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.guru99.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//bootstrap dropdown
		
	WebElement target = driver.findElement(By.xpath("(//div[@class='g-menu-item-container'])[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();
		
		
		
		
		Thread.sleep(2000);
//		driver.findElement(By.xpath("((//div[@class='g-block size-34'])[1]/ul//following-sibling::li)[5]/a/span/span[contains(text(),'Mobile Testing')]")).click();
		
		List <WebElement> lis = driver.findElements(By.xpath("//a[@class='g-menu-item-container']/span/span"));
		
        
		for(int i = 0; i <lis.size(); i++) {
			String s = lis.get(i).getText();
			System.out.println(s);
//			if(lis.get(i).getText().equalsIgnoreCase("Mobile Testing")) {
//				lis.get(i).click();
//			}
			
		}
		
	}

}
