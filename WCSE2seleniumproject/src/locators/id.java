package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("sayalinagawade@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Sayali");
driver.findElement(By.id("u_0_5_sY")).click();
Thread.sleep(2000);
driver.quit();
	}

}
