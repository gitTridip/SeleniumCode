package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class FileUploadWIthoutUsingSendkeys {
	public static void main(String[] args) {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://www.smallpdf.com/pdf-converter/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='Choose Files']")).click();
		StringSelection str=new StringSelection("C:\\Users\\TRIDIP\\OneDrive\\Documents\\Final Report.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		try {
			Thread.sleep(1000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("Interrupted exception");
		}
	}
}
