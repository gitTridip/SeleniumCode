package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameAsLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/TRIDIP/OneDrive/Documents/HTML/seleniumsourcepage.html");
		driver.findElement(By.name("pwd")).sendKeys("hgds");
		Thread.sleep(5000);
		driver.quit();
	}
}
