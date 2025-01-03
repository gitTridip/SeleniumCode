package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class MyntraAddtoWishList {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Hoodies for men",Keys.ENTER);
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='new']")));
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//div[@class='product-actions '])[1]/span")));
		driver.quit();
	}
}
