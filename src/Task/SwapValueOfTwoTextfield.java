package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class SwapValueOfTwoTextfield {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		driver.get("C:\\Users\\TRIDIP\\OneDrive\\Documents\\HTML\\Swapvalue.html");
		driver.findElement(By.id("un")).sendKeys(Keys.CONTROL+"a","x");
		//driver.findElement(By.id("un")).sendKeys(Keys.CONTROL+"x");
		driver.findElement(By.id("var")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("pwd")).sendKeys(Keys.CONTROL+"a","x");
		//driver.findElement(By.id("pwd")).sendKeys(Keys.CONTROL+"x");
		driver.findElement(By.id("un")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("var")).sendKeys(Keys.CONTROL+"a","x");
		//driver.findElement(By.id("var")).sendKeys(Keys.CONTROL+"x");
		driver.findElement(By.id("pwd")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.quit();
	}
}
