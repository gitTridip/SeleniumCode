package Practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import Generic.GenericOpen;

public class cazz {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=GenericOpen.chrome();
//		driver.get("C:\\Users\\TRIDIP\\OneDrive\\Documents\\HTML\\seleniumsourcepage.html");
//		List<WebElement> li=driver.findElements(By.xpath("//body/div/div"));
//		for(WebElement i:li) {
//			System.out.println(i.findElement(By.xpath(".//div[1]/h2")).getText());
//		}
//		driver.quit();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		driver.findElement(By.xpath("//a[.='Register now!']")).click();
		List<String> l=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(l.get(1));
		Thread.sleep(1000);
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\TRIDIP\\OneDrive\\Desktop\\SeleniumScreenshot\\test2.jpeg"));
		
	}
}
