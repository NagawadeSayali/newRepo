package webDriverMethod;

//import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithManage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		 //Point targetPosition = new Point(350,250);
		//driver.manage().window().setPosition(targetPosition);
		driver.quit();
	
		

	}

}
