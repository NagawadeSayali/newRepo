package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-vvs2cke/login.do");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		if(loginButton.isDisplayed())
		{
			System.out.println("login button is displayed");
		}
		else
		{
			System.out.println("login button is not displayed");
		}
		driver.quit();

	}

}
