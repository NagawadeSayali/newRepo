package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyusingcontainsfunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = '✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class, 'Pke')]")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
