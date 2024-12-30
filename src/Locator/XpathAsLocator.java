package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAsLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/TRIDIP/OneDrive/Documents/HTML/Xpath.html");
		driver.findElement(By.xpath("html/body/div[2]/input[1]")).sendKeys("pod mara");
	}
}
