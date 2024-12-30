package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class FacebookLoginWithoutUsingLoginButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kjsdh",Keys.TAB,"knbfvhj",Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}
}
