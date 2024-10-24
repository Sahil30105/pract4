package prac4;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SahilGupta\\tycs\\STQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("catsrule@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tuxedocat123");
		driver.findElement(By.name("login")).click();
	}
}
