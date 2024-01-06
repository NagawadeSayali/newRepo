package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("[name = 'username']")).sendKeys("Admin");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("[name = 'password']")).sendKeys("admin123");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("[type = 'submit']")).click();
			driver.quit();

	}

}
