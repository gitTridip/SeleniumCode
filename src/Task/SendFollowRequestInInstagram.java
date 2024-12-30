package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendFollowRequestInInstagram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(1000);
	driver.findElement(By.name("username")).sendKeys("9749589740");
	driver.findElement(By.name("password")).sendKeys("#Tridip@03");
	//Thread.sleep(10000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div/div/div/div/div/section/main/div/div/div/div[2]/form/div[5]/button/div")).click();	//Backup codes button xpath
	Thread.sleep(3000);
	driver.findElement(By.name("verificationCode")).sendKeys("20319748");
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div/div/div/div/div/section/main/div/div/div/div[2]/form/div[2]/button")).click();	//verify button xpath
	Thread.sleep(6000);
	driver.findElement(By.cssSelector("span[aria-describedby=':r4:']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[aria-label='Search input'")).sendKeys("niranjan_ka_18");	//
	driver.findElement(By.cssSelector("object[type='nested/pressable']")).click();	//Clickable profile cssSelector
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/main[1]/div[1]/header[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();	//Follow button xpath
	Thread.sleep(5000);
	driver.quit();
}
}
