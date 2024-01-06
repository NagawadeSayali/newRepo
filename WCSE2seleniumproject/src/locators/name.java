package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.name("Email")).sendKeys("sayalinagawade@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Sayali");
		driver.findElement(By.className("button-1 login-button")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
