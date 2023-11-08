package in;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2 {

	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Dell/Downloads/iframe.html");
		
//		WebElement wb= driver.findElement(by.xpath)
		
		
		driver.switchTo().frame(8);
		
		
	}
}
