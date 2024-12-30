package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegistration {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Tridip");
		driver.findElement(By.id("LastName")).sendKeys("Pramanik");
		driver.findElement(By.name("Email")).sendKeys("kjgbhvhv8@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("abc120");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("abc120");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("ico-logout")).click();
	}
}
