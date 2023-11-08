package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePrj {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://punjab.chitkara.edu.in//Interface/index.php");
		//System.out.println(driver.getTitle());
		
	//	System.out.println(driver.getCurrentUrl());
		
		//driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		//driver.navigate().back();
		//Thread.sleep(2000);
		
		WebElement searchbox= driver.findElement(By.id("username"));
		searchbox.sendKeys("2010990318");
		
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("Ishita@8660");
		
		WebElement sub= driver.findElement(By.className("button_send"));
		sub.click();
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
