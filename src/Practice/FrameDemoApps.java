package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class FrameDemoApps {
	public static void main(String[] args) {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().frame(0);
		String email=driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		String password=driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		String confirmPass=driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys(email);
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		driver.findElement(By.tagName("input")).sendKeys(password);
		driver.switchTo().parentFrame();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		driver.switchTo().frame(2);
		driver.findElement(By.tagName("input")).sendKeys(confirmPass);
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(3);
		driver.findElement(By.tagName("button")).click();
		driver.switchTo().defaultContent();
		
		try {
			Thread.sleep(750);
			System.out.println(driver.findElement(By.xpath("//div[@role='status']")).isDisplayed()?"Notification displayed":"Notification not displayed");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
