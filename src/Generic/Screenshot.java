package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	static String path="C:\\Users\\TRIDIP\\OneDrive\\Desktop\\SeleniumScreenshot\\";
	static Date d;
	public static void page(WebDriver driver) {
		d=new Date();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted exception");
		}
		File target=new File(path+d.toString().replace(":", "-").replace(" ", "_")+".jpeg");
		try {
			FileHandler.copy(src, target);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to take Screenshot");
		}
	}
	public static void element(WebElement w) {
		d=new Date();
		File src = w.getScreenshotAs(OutputType.FILE);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted exception handled");
		}
//		File target=new File(path+"Element\\"+w.findElement(By.xpath("(.//a)[2]")).getText()+d.toString().replace(":", "-").replace(" ", "_")+".jpeg");
		File target=new File(path+"Element\\"+d.toString().replace(":", "-").replace(" ", "_")+".jpeg");
		try {
			FileHandler.copy(src, target);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to take Screenshot");
		}
	}
}
