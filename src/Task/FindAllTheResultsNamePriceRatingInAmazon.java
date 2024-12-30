package Task;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.GenericOpen;

public class FindAllTheResultsNamePriceRatingInAmazon {
	public static void main(String[] args){
		WebDriver driver=GenericOpen.chrome();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("condom",Keys.ENTER);
		List<WebElement> we=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		////div[@class='a-section']/div/div[2]/div/div
		int j=1;
		for(WebElement i:we) {
			System.out.println("Product no: "+j);
			System.out.println(i.findElement(By.xpath(".//a/h2/span")).getText());
			try {
				//System.out.println(i.findElement(By.xpath(".//div/span/a/i/span")).getText());
				System.out.println(i.findElement(By.xpath(".//div/a/span")).getText());
			}
			catch (NoSuchElementException e) {
				System.out.println("No Ratings");
			}
			try {
				System.out.println(i.findElement(By.xpath(".//a/span/span/span[2]")).getText());
			}
			catch (NoSuchElementException e) {
				System.out.println("Out of Stock");
			}
			
			j++;
			System.out.println("------------------------------------------------------------------------------------");
		}
		driver.quit();
	}
}
