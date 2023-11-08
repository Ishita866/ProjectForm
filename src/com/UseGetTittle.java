package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseGetTittle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();   //upcasting
		
	  driver.get("https://www.instagram.com/");
	  
	  String s="Instagram";
	  if(driver.getTitle().equals(s))
		  System.out.println("Test Case passed");
	  else
	  System.out.println("Test case failed");
		
		
		
	}

}
