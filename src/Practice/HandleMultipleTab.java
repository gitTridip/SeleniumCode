package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Generic.GenericOpen;

public class HandleMultipleTab {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=GenericOpen.firefox();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Robot r=new Robot();
		
//		act.contextClick(driver.findElement(By.id("navbarDropdown"))).build().perform();
//		r.keyPress(KeyEvent.VK_T);
//		r.keyRelease(KeyEvent.VK_T);
		for(int i=1;i<=5;i++) {
			act.contextClick(driver.findElement(By.xpath("(//a[@class='nav-link'])["+i+"]"))).build().perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
		
		Set<String> all_id=driver.getWindowHandles();
		System.out.println(all_id);
		List<String> l=new ArrayList<String>(all_id);
		System.out.println(l);
		driver.switchTo().window(l.get(2));
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();
		
	}
}
