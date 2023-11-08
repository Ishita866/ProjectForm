package AutomatedSites;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHr {
	
	public static void main(String[] args) throws AWTException, InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.findElement(By.xpath("//input[contains(@class,'oxd-input') and contains(@class,'oxd-input--active')][1]")).sendKeys("Admin",Keys.TAB,("admin123"));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin", Keys.TAB, ("admin123"),Keys.TAB);
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][1]")).click();
	
		
		Thread.sleep(2000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']"));
		
		
		
		
		
	}

}
