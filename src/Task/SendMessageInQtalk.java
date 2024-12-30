package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendMessageInQtalk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chat.qspiders.com/");
		driver.findElement(By.name("username")).sendKeys("tridippramanik2003@gmail.com");
		driver.findElement(By.name("password")).sendKeys("#Tridip@03");
		driver.findElement(By.cssSelector("button[type='submit'")).click();
		Thread.sleep(60000);
		driver.findElement(By.name("search")).sendKeys("Niranjan L T");
		Thread.sleep(2000);
		driver.findElement(By.className("_chat_conversation__wGPeN")).click();
		for(int i=0;i<10;i++) {
			driver.findElement(By.id("message")).sendKeys("This is an automated machine generated message");
			driver.findElement(By.className("chatSubmitButton")).click();
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
