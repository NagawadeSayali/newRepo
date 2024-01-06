package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-vvs2cke/login.do");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("admin123");
         driver.quit();
	}

}
