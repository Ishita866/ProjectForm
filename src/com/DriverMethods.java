package com;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
//driver.manage().window().fullscreen();
		System.out.println(driver.getCurrentUrl());
	//
//System.out.println(driver.getPageSource());   //(gives the source code, not generally used)
		
		
		//tions man=driver.manage();
//Window win= man.window();
	//in.maximize();
		
//driver.manage().window().maximize();
//driver.manage().window().fullscreen();
		
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		Dimension dim= new Dimension(1000,700);
		driver.manage().window().setSize(dim);
		
	
	
		}

}
