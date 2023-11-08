package AutomatedSites;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {
	
	public static void main(String[] args) throws InterruptedException, AWTException  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'formInput __input')][1]")).sendKeys("Ishita", Keys.TAB,"ishita0318.be20@chitkara.edu.in",Keys.TAB, ("ishita123"),Keys.TAB,"6239519267",Keys.TAB);
		
		driver.findElement(By.xpath("(//h2[@class='main-3'])[2]")).click();
		
		driver.findElement(By.className("ddInput")).sendKeys("Rajpura");
		
		////span[text()='Punjab']
		
		driver.findElement(By.name("currentState")).sendKeys("punjab");
		
		driver.findElement(By.xpath("//span[text()='Punjab']")).click();
		
	     //driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("\"C:\\Users\\Dell\\Documents\\IshitaQAResume.docx\"");
		//BY USING ROBOT CLASS
		
		
		Thread.sleep(2000);
		
		StringSelection path= new StringSelection("C:\\Users\\Dell\\Documents\\IshitaQAResume.docx");
		
		Clipboard cp=Toolkit.getDefaultToolkit().getSystemClipboard();
		cp.setContents(path, null);
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
	}

}
