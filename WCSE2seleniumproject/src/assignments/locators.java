package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.com");
		// TODO Auto-generated method stub
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//open the web application
		driver.get("https://www.instagram.com/accounts/login/");

		driver.findElement(By.name("username")).sendKeys("its_Sayali16");
	
		driver.findElement(By.name("password")).sendKeys("Pratikac127@");
		
		driver.findElement(By.className("_acap")).click();

		
		//fetching the title of instagram
		String pageTitle = driver.getTitle();
		System.out.println("Title of instagram page" +pageTitle);
		
		driver.quit();

	}

}
