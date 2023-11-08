package BasicsOfTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
		
	
	@Test(priority=1)
	public void register()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ishita",Keys.TAB, "Gandotra",Keys.TAB,"igandotra2001@gmail.com",Keys.TAB,"ishita123",Keys.TAB,"ishita123",Keys.TAB,Keys.ENTER);
		
	}
	
	@Test(priority=2)
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("igandotra2001@gmail.com",Keys.TAB,"ishita123",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
	}
	
	@Test(priority=3)
	public void addToCart()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("igandotra2001@gmail.com",Keys.TAB,"ishita123",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("book",Keys.ENTER);
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
		
		
		
		
	}
	@Test(priority=4)
	public void logOut()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("igandotra2001@gmail.com",Keys.TAB,"ishita123",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}

}

