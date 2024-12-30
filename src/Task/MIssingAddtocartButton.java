package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Screenshot;

public class MIssingAddtocartButton {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/apparel-shoes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		check(driver);
		driver.findElement(By.xpath("//a[.='Next']")).click();
		check(driver);
		driver.quit();
	}

	static void check(WebDriver driver) throws InterruptedException {
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='item-box']"));
		for(WebElement w:products) {
			try {
				if(w.findElement(By.xpath(".//input[@value='Add to cart']")).isDisplayed()) 
				{
					System.out.println("Button is present");
				
				}
			}
			catch (NoSuchElementException e) 
			{
				System.out.println("Button is not present");
				Screenshot.element(w);
			}
		}
		
	}
}
