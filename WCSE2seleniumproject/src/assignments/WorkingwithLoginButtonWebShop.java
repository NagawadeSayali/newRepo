package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithLoginButtonWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys("nagawadesayali1@gmail.com");

		driver.findElement(By.name("Password")).sendKeys("Sayali@123");
	
		driver.findElement(By.cssSelector("[value = 'Log in']")).click();
		
     
		//fetching the title of demo web shop
		String pageTitle = driver.getTitle();
		System.out.println("Title of demo web shop " +pageTitle );
		
		driver.quit();
	}

}
