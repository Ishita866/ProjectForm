package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin", Keys.TAB, ("admin123"),Keys.TAB);
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
		WebElement dropdown=driver.findElement(By.xpath("//div[contains(@class,'oxd-select-text oxd-select-text--active')][1]"));
		
		Select s= new Select(dropdown);
		s.selectByIndex(2);
	
	}

}
