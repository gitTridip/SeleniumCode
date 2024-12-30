package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Generic.GenericOpen;

public class DropdownElementsText {
	public static void main(String[] args) {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Select s=new Select(driver.findElement(By.name("birthday_month")));
		List<WebElement> l=s.getOptions();
		ArrayList<String> mn=new ArrayList<String>();
		for (WebElement name : l) {
			mn.add(name.getText());
		}
		Collections.sort(mn);
		Collections.reverse(mn);
		mn.remove("May");
		for (String string : mn) {
			System.out.println(string);
		}
		driver.quit();
	}
}
