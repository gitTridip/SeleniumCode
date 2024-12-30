 package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeeReelsOnInstagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("heyyou8097@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Heyyou@2024");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[text()='backup codes']")).click();	//Backup codes button xpath
//		Thread.sleep(3000);
//		driver.findElement(By.name("verificationCode")).sendKeys("97354130");
//		driver.findElement(By.xpath("//button[text()='Confirm']")).click();	//verify button xpath
//		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Reels']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Audio is muted'][1]")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Like'][1]")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Like'][1]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
