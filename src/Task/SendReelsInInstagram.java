package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendReelsInInstagram {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("9749589740");
		driver.findElement(By.name("password")).sendKeys("#Tridip@03");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='backup codes']")).click();	//Backup codes button xpath
		driver.findElement(By.name("verificationCode")).sendKeys("46183759");
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();	//verify button xpath
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Reels']")).click();
		driver.findElement(By.xpath("(//*[name()='svg' and @aria-label='Audio is muted'])[1]")).click();
		int limit=100;
		Actions actions=new Actions(driver);
		for(int i=2;i<limit;i++) {
			actions.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN).perform();
			driver.findElement(By.xpath("(//*[name()='svg' and @aria-label='Share'])["+i+"]")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("ghosh_sumana07");
			driver.findElement(By.xpath("(//input[@name='ContactSearchResultCheckbox'])[1]")).click();
			driver.findElement(By.xpath("//input[@name='shareCommentText']")).sendKeys("This is an automated sended Reel, so sir please dont look into the content");
			driver.findElement(By.xpath("//div[text()='Send' and @role='button']")).click();
		}
		driver.quit();
	}
}
