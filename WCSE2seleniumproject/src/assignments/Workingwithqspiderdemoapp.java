package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithqspiderdemoapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.cssSelector("[placeholder = 'Enter your name']")).sendKeys("Sayali");

		driver.findElement(By.cssSelector("[placeholder = 'Enter your email']")).sendKeys("nagawadesayali1@gmail.com");
		
		driver.findElement(By.cssSelector("[placeholder= 'Enter your password']")).sendKeys("Sayali@123");
		
		driver.findElement(By.cssSelector("[type = 'submit']")).click();
		
	    driver.findElement(By.cssSelector("[placeholder = 'Enter your email']")).sendKeys("nagawadesayali1@gmail.com");
	  
		driver.findElement(By.cssSelector(" [placeholder = 'Enter your password']")).sendKeys("Sayali@123");
		
		driver.findElement(By.cssSelector(" [type = 'submit']")).click();
		
		driver.quit();
	}

}
