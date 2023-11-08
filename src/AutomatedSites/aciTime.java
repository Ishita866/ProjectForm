package AutomatedSites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class aciTime {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,("manager"),Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.xpath("//div[@class='img'][1]")).click();
		
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
		Thread.sleep(2000);
		
		WebElement del= driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]"));
		
		System.out.println(del.getText());
	}

}
