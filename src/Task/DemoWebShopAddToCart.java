package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopAddToCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("tridip468@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc120");
		Thread.sleep(3000);
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		driver.findElement(By.id("add-to-cart-button-28")).click();
		driver.findElement(By.className("ico-cart")).click();
		//driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		
		
		driver.findElement(By.className("ico-logout")).click();
		driver.close();
	}
}
