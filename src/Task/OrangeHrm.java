package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class OrangeHrm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
		driver.findElement(By.name("firstName")).sendKeys("Antu");
		driver.findElement(By.name("middleName")).sendKeys("Jhantu");
		driver.findElement(By.name("lastName")).sendKeys("Gandu"+Keys.ENTER);
		Thread.sleep(1750);
		if(driver.findElement(By.id("oxd-toaster_1")).isDisplayed()) {
			System.out.println("Toast displayed");
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.xpath("//a[.='Logout']")).click();
			Thread.sleep(2000);
			driver.quit();
		}
	}
}
