package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPageSource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  driver.get("https://www.instagram.com/accounts/login/");
  String sourceCodeofLoginPage = driver.getPageSource();
  System.out.println(sourceCodeofLoginPage);
  Thread.sleep(2000);
  driver.quit();
	}

}
