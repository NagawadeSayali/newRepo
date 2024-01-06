package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithRegisterButtoninwebshop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
	
		driver.findElement(By.name("FirstName")).sendKeys("Sayali");
	
		driver.findElement(By.name("LastName")).sendKeys("Nagawade");

		driver.findElement(By.name("Email")).sendKeys("nagawadesayali1@gmail.com");
	
		driver.findElement(By.name("Password")).sendKeys("Sayali@123");
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Sayali@123");
		
		driver.findElement(By.id("register-button")).click();

		// fetching the title of demo web shop
		String pageTitle = driver.getTitle();
		System.out.println("Title of demo web shop " + pageTitle);

		driver.quit();

	}

}
