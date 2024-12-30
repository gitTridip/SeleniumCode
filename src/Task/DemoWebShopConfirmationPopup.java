package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("tridip468@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc120");
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).isDisplayed()) {
			System.out.println("Element is displayed");
			driver.findElement(By.className("cart-label")).click();
			driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		}
		else {
			System.out.println("ELement is not displayed");
			driver.findElement(By.className("cart-label")).click();
			driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		}
		driver.quit();
	}
}
