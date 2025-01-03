package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Generic.GenericOpen;

public class AmazonScroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		WebElement element = driver.findElement(By.xpath("(//a[@aria-label='Choose a language for shopping. Current selection is English. '])[2]"));
		System.out.println(element.getLocation());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+element.getLocation());
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//a[@lang='ta-IN'])[2]")));
	}
}
