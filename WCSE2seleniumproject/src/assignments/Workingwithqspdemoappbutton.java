package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithqspdemoappbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get("https://demoapps.qspiders.com/button?sublist=0");
		
		driver.findElement(By.xpath("//button[text() = 'Yes'][1]")).click();
	
		driver.findElement(By.id("btn3")).click();
		
		driver.findElement(By.id("btn8")).click();

		driver.quit();
	}

}
