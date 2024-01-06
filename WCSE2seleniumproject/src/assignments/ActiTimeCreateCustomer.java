package assignments;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCreateCustomer {

	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		int no = r.nextInt(10000);
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://desktop-vvs2cke/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
		driver.findElement(By.xpath("(//img[contains(@class, 'sizer') ])[1]")).click();

		driver.findElement(By.xpath("//a[text() = 'Projects & Customers']")).click();
		
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sayali"+ no);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		
		driver.quit();
}

}
