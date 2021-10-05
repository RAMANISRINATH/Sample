package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinath\\eclipse-workspace\\Browserlaunch\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("email");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("12345");
		
	}
	
}
