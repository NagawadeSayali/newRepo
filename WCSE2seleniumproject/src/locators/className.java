package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class className {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//active element
		driver.switchTo().activeElement().sendKeys("phoebe buffay" , Keys.ENTER);
		//identify the guitar
		driver.findElement(By.className("lNPNe")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
