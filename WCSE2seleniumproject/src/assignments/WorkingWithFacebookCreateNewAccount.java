package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithFacebookCreateNewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()= 'Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sayali");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nagawade");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nagawadesayali1@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Sayali@1698");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s1 = new Select(dropdown1);
		s1.selectByVisibleText("16");
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s2 = new Select(dropdown2);
		s2.selectByVisibleText("Feb");
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3 = new Select(dropdown3);
		s3.selectByVisibleText("2024");
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		driver.findElement(By.xpath("//button[text() = 'Sign Up']")).click();
				

	}

}
