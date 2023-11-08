package AutomatedSites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
    public static void main(String[] args) {
     //   System.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Find the username and password fields, and input your credentials
        WebElement usernameElement = driver.findElement(By.id("txtUsername"));
        WebElement passwordElement = driver.findElement(By.id("txtPassword"));

        usernameElement.sendKeys("Admin");
        passwordElement.sendKeys("admin123");

        // Click on the login button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        // Wait for the page to load (you might need to add explicit waits here)
        // Now, click on the "Admin" link
        WebElement adminLink = driver.findElement(By.xpath("//a[contains(@class,'menu_admin')]"));
        adminLink.click();

        // Rest of your code...
    }
}
