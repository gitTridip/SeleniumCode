package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.GenericOpen;
import Generic.Screenshot;

public class TakeScreenshotOfDefect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://demowebshop.tricentis.com/apparel-shoes");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		List<WebElement> cart=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement w:cart) {
			w.click();
			Thread.sleep(2000);
			if(driver.findElement(By.id("bar-notification")).isDisplayed()) {
				System.out.println("Notification displayed");
			}
			else {
				Screenshot.page(driver);
				driver.navigate().back();
			}
			Thread.sleep(2000);
		}
		driver.quit();
	}
}
