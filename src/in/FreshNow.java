package in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FreshNow {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.mocktest.freshersnow.com/home");
		
		Actions act = new Actions(driver);
		WebElement a= driver.findElement(By.xpath("//li[@id='all-exams-id']"));
		
		act.moveToElement(a);
		
		driver.findElement(By.xpath("(//li[@id='ssc-17'])[1]")).click();
		
//		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//a[text()='SSC CHSL'])[1]")).click();
	
	}

}
