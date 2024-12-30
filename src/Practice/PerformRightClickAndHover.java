package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Generic.GenericOpen;

public class PerformRightClickAndHover {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Bengali']"))).build().perform();
		act.contextClick(driver.findElement(By.xpath("//a[@title='Bengali']"))).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		driver.quit();
	}
}
