package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Generic.GenericOpen;

public class SeleniumWebsite {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		Actions act=new Actions(driver);
		Robot r=new Robot();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		act.contextClick(driver.findElement(By.id("navbarDropdown"))).build().perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		for(int i=1;i<=5;i++) {
			act.contextClick(driver.findElement(By.xpath("(//a[@class='nav-link'])["+i+"]"))).build().perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
