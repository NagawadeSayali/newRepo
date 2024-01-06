package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("http://desktop-vvs2cke/login.do");
     WebElement username = driver.findElement(By.name("username"));
     Dimension size = username.getSize();
     System.out.println(size);
     driver.quit();
     
	}

}
