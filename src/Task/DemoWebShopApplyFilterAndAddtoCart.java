package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Generic.GenericOpen;

public class DemoWebShopApplyFilterAndAddtoCart {
	public static void main(String[] args) {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("tridip468@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc120");
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		Select s=new Select(driver.findElement(By.id("products-orderby")));
		s.selectByIndex(3);
		s=new Select(driver.findElement(By.id("products-pagesize")));
		s.selectByIndex(2);
		s=new Select(driver.findElement(By.id("products-viewmode")));
		s.selectByIndex(1);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.findElement(By.className("ico-cart")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		driver.findElement(By.className("ico-logout")).click();
		driver.quit();
	}
}
