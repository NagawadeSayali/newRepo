package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoappsqspider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
   driver.get("https://demoapps.qspiders.com/formValidation?sublist=0");
   Thread.sleep(2000);
   //driver.findElement(By.xpath("//section[text() = 'Web Elements']")).click();
   
   //driver.findElement(By.xpath("//section[text() = 'FormValidation']")).click();
   
   driver.findElement(By.xpath("//input[@placeholder='Type something']")).sendKeys("Sayali");
   driver.findElement(By.xpath("//input[@placeholder='Min 6 chars.']")).sendKeys("1234567");
   
   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sayali@123");
   
   driver.findElement(By.xpath("//input[@placeholder='Max 6 chars.']")).sendKeys("1234");
   
   driver.findElement(By.xpath("//input[@placeholder='Re-Type Password']")).sendKeys("Sayali@123");

   driver.findElement(By.xpath("//input[@placeholder='Enter a valid e-mail']")).sendKeys("nagawadesayali1@gmail.com");
   
   driver.findElement(By.xpath("//input[@placeholder='Text between 5 - 10 chars length']")).sendKeys("truee");
   
   driver.findElement(By.xpath("//input[@placeholder='URL']")).sendKeys("www.google.com");
  
   driver.findElement(By.xpath("//input[@placeholder='Enter only digits']")).sendKeys("16298");
 
   driver.findElement(By.xpath("//input[@placeholder='Enter only numbers']")).sendKeys("271998");
   
   driver.findElement(By.xpath("//input[@placeholder='Enter alphanumeric value']")).sendKeys("Chhaya123");
 
   driver.findElement(By.xpath("//input[@placeholder='Min value is 6']")).sendKeys("678905");
   
   driver.findElement(By.xpath("//input[@placeholder='Max value is 6']")).sendKeys("1");
   
   driver.findElement(By.xpath("//input[@placeholder='Number between 6 - 100']")).sendKeys("99");
   
   driver.findElement(By.xpath("//button[text()= 'Submit']")).click();
  
   driver.quit();
   
	}

}
