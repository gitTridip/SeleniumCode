package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.GenericOpen;

public class cazz {
	public static void main(String[] args) {
		WebDriver driver=GenericOpen.chrome();
		driver.get("C:\\Users\\TRIDIP\\OneDrive\\Documents\\HTML/seleniumsourcepage.html");
		List<WebElement> li=driver.findElements(By.xpath("//body/div/div"));
		for(WebElement i:li) {
			System.out.println(i.findElement(By.xpath(".//div[1]/h2")).getText());
		}
		driver.quit();
	}
}
