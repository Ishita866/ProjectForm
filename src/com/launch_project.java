package com;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class launch_project{
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n;
		System.out.println("Enter the number of your choice");
		n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			ChromeDriver driver = new ChromeDriver();
			break;
		case 2: 
			FirefoxDriver driver2= new FirefoxDriver();
			break;
		case 3:
			EdgeDriver driver3= new EdgeDriver();
			break;
			default:
				System.out.println("invalid Input");
		}
			
	}
	
	
	
}
