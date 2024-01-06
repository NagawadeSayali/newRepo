package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class airvistarabooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.airvistara.com/");
		
		WebElement cookies = driver.findElement(By.xpath("//button[contains(text() ,  'Accept All')]"));
		
		cookies.click();
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("PNQ");
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("DEL");
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		driver.findElement(By.xpath("//a[text() ='3']")).click();
		driver.findElement(By.xpath("//a[text() ='6']")).click();
		driver.findElement(By.xpath("//button[text() = 'Search Flights']")).click();
		
	

	}

}
