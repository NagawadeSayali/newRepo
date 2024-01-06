package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDeselectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("India");
		Thread.sleep(2000);
		s.selectByVisibleText("Canada");
		Thread.sleep(2000);
		s.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		s.deselectByVisibleText("India");
		Thread.sleep(2000);
		s.deselectByVisibleText("Canada");
		Thread.sleep(2000);
		s.deselectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
