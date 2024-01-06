package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-vvs2cke/login.do");
		WebElement username = driver.findElement(By.name("username"));
		Rectangle rect = username.getRect();
		int height = rect.getHeight();
		 int width = rect.getWidth();
		 int x = rect.getX();
		 int y = rect.getY();
		 System.out.println(height);
		 System.out.println(width);
		 System.out.println(x);
		 System.out.println(y);
		 driver.quit();

	}

}
