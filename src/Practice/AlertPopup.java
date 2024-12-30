package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class AlertPopup {
	public static void main(String[] args) {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("7889",Keys.ENTER);
		Alert a = driver.switchTo().alert();
		a.accept();
		a.accept();
		driver.quit();
	}
}
