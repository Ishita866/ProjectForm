package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().fullscreen();
		//driver.close();
		driver.quit();
	}

}
