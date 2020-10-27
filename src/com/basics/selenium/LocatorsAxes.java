package com.basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/login.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("slow and steady wins the race");
		
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("I will try again");
		
		WebElement signIN = driver.findElement(By.id("SubmitLogin"));
		boolean b = signIN.isDisplayed();
		System.out.println(b);
		
		signIN.submit();
		
		
		
		//find elements
		
//		WebElement button = driver.findElement(By.xpath("//input[@id='yes']"));
//		button.click();
//		
//		WebElement resetButton = driver.findElement(By.xpath("//input[contains(@value,'Reset')]"));
//		resetButton.click();
//		
//		
//		//find multiple elements
//		
//		List <WebElement> lis = driver.findElements(By.name("name"));
//		
//		for(int i = 0; i <lis.size(); i++) {
//			System.out.println(lis.get(i).getAttribute("value"));
//		}
		
		//locators
		
		//id - name - className - xpath - cssSelector - tagname - linkText - Partial LinkText
		
		//Xpath ---- relative Xpath && Absolute Xpath
		
//		
//		WebElement byId = driver.findElement(By.id("email"));
//		byId.sendKeys("iamnotusingfacebook");
		
//		WebElement byclassname = driver.findElement(By.className("uiInputLabelCheckbox"));
//		byclassname.click();
		
//		WebElement byName = driver.findElement(By.name("pass"));
//		byName.sendKeys("pleasetryagain");
//		
//		WebElement byIdChange = driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]"));
//		byIdChange.click();
//		
//		WebElement byClose = driver.findElement(By.xpath("//img[contains(@id,'u_1')]"));
//		byClose.click();
		
		
//		driver.findElement(By.name("userName")).sendKeys("tutorial");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
//		driver.findElement(By.name("submit")).click();
//		
//		//flights
//		
//		driver.findElement(By.linkText("Flights")).click();
//		
//		driver.findElement(By.xpath("//input[@value='roundtrip']/following::input[1]")).click();
//		
//		//dropdown
//		
//		Select se = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
//		se.selectByValue("4");
//		
//		
//		Select sel = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
//		sel.selectByValue("Paris");
//		
//		Select sele = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
//		sele.selectByValue("8");
//		
//		Select selec = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
//		selec.selectByValue("20");
//		
//		Select s = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
//		s.selectByValue("8");
//		
//		Select select = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
//		select.selectByValue("24");
//		
//		
//		
//		driver.findElement(By.xpath("//input[@name='servClass']/following::input[@name='servClass'][2]")).click();
//		
//		Select see = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
//		see.selectByIndex(3);
//		
//		
//		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
//		
//		
//		driver.findElement(By.xpath("//td/a/img")).click();
//		String titlePage = driver.getTitle();
//		System.out.println(titlePage);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
