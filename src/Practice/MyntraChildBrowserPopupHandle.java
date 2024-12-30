package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class MyntraChildBrowserPopupHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("Hoodies For Men",Keys.ENTER);
		driver.findElement(By.xpath("//ul[@class='results-base']/li[3]/a")).click();
		List<String> l=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(l.get(1));
		driver.findElement(By.xpath("//p[.='S']/..")).click();
		driver.findElement(By.xpath("//div[@class='colors-container']/following-sibling::div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("//div[@class='desktop-actions']/a[2]/span[1]")).click();
		driver.findElement(By.xpath("//button[.='REMOVE']")).click();
		driver.findElement(By.xpath("(//button[.='REMOVE'])[2]")).click();
		
		driver.quit();
	}
}
