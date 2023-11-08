package in;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Dell/Downloads/iframe.html");
		driver.switchTo().frame(0);
		
		//driver.findElement(By.className("ico-login")).click();
		
		//driver.switchTo().frame(1);
	//	driver.findElement(By.className("menu-toggle")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("car",Keys.ENTER);
		
		
	}

}
