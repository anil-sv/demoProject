package com.basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91836\\eclipse-workspace\\SeleniumPrep\\drivers\\chromedriver_84.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		//waits
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		//verify title
		
		String ActualTitle = "Welcome: Mercury Tours";
		
		//compare two titles
		
		boolean afterComparision = ActualTitle.equalsIgnoreCase(pageTitle);
		
		if(afterComparision == true) {
			System.out.println("Titles are matched");
		}else
			System.out.println("Titles are changed");
		
		
		//getTagName
		
		String tagname = driver.findElement(By.xpath("//a[contains(text(),'your destination')]")).getTagName();
		System.out.println(tagname);
		
		
		String getAttribute = driver.findElement(By.xpath("//a[contains(text(),'Salon Travel')]/preceding::a[52]")).getAttribute("href");
		System.out.println(getAttribute);

//converting string to integer
		
		WebElement value = driver.findElement(By.xpath("(//font[@face='Arial, Helvetica, sans-serif, Verdana'])[2]/b"));
		String num1 = value.getText();
		
		System.out.println(num1);
		
		String s = num1.substring(1);
		
		System.out.println(s);
		
		WebElement value2 = driver.findElement(By.xpath("(//font[@face='Arial, Helvetica, sans-serif'])[3]/b"));
		String num2 = value2.getText();
		
		System.out.println(num2);
		
		String s2 = num2.substring(1);
		
		System.out.println(s2);
		
		
	//	String[] s = num2.split("$");
		
		int n1 = Integer.parseInt(s);
		int n2 = Integer.parseInt(s2);
		
		int sum = n1 + n2;
		
		System.out.println(sum);
		
		int ActualSum = 911;
		
		if(sum == ActualSum) {
			System.out.println("values are correct");
		}else
			System.out.println("values are changed");
		
		
		//close the driver
		
		driver.close();
		
		

	}

}
