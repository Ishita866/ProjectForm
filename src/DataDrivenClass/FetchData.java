package DataDrivenClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchData {
public static void main(String[] args) throws IOException  {
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	FileInputStream fs= new FileInputStream("C:\\Users\\Dell\\Documents\\testdata.properties");
	
	Properties pobj= new Properties();
	pobj.load(fs);
	
	String username=pobj.getProperty("un");
	
	String pwd= pobj.getProperty("pwd");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
	
	//WorkbookFactory.create(false);
	
	
	
	
}
}
