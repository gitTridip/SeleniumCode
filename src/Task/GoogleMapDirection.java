package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapDirection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps");
		driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("chikkamagaluru, karntaka");
		driver.findElement(By.id("searchbox-searchbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-value='Directions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Choose starting point, or click on the map...']")).sendKeys("chandipur, west bengal");
		driver.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
		Thread.sleep(8000);
		driver.quit();
	}
}
