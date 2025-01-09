package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Generic.GenericOpen;

public class ExplicitlyWait {
	public static void main(String[] args) {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://merch.riotgames.com/en-us/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[.='Sign In']")))).click();
	}
}
