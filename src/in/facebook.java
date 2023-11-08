package in;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Thread.sleep(2000);
	
	    FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\facebookData.properties");
	    
	    Properties pobj= new Properties();
	    
	    pobj.load(fis);
	    
	    String url= pobj.getProperty("url");
	    String firstName= pobj.getProperty("firstname");
	    String surname= pobj.getProperty("surname");
	    String mbno= pobj.getProperty("mbno");
	    String pwd= pobj.getProperty("pass");
	    String date= pobj.getProperty("date");
	    String month= pobj.getProperty("month");
	    String year= pobj.getProperty("year");
	    
	    driver.get(url);
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName,Keys.TAB,surname,Keys.TAB,mbno,Keys.TAB,pwd);
	    
	    WebElement Date= driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    
	    Select s = new Select(Date);
	    s.selectByVisibleText(date);
	    
  WebElement Month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
	    
	    Select s1 = new Select(Month);
	    s1.selectByVisibleText(month);
	    
 WebElement Year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
	    
	    Select s2 = new Select(Year);
	    s2.selectByVisibleText(year);
	    
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	    
	    driver.findElement(By.xpath("//button[text()='Sign Up'][1]")).click();
	    
	    
	    
	    
	    
	    
	    
	}

}
