package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class Naukri_com {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String pid=driver.getWindowHandle();
		System.out.println(pid);
		driver.findElement(By.xpath("//div[.='Services']")).click();
		Set<String> all_id=driver.getWindowHandles();
		for(String id:all_id) {
			Thread.sleep(3000);
			driver.switchTo().window(id);
			System.out.println(id);
		}
	}
}
