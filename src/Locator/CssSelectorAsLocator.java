package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorAsLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("urfi javed");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("jani na");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.quit();
	}
}
