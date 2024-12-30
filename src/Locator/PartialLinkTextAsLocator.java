package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextAsLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/TRIDIP/OneDrive/Documents/HTML/seleniumsourcepage.html");
		driver.findElement(By.partialLinkText("book")).click();
		driver.close();
	}
}
