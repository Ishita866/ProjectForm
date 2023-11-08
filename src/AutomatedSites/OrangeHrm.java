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

public class OrangeHrm {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin", Keys.TAB, ("admin123"),Keys.TAB);
		
		driver.findElement(By.xpath("//button[contains(@class, 'oxd-button--medium') and contains(@class, 'oxd-button--main') and contains(@class, 'orangehrm-login-button')]")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
		driver.findElement(By.xpath(" //div[contains(@class,'oxd-select-text--active')][1]"));
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

	
	}

}
