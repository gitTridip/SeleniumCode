package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Generic.GenericOpen;

public class HiddenDivisonAndFileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("dateOfBirthInput")).click();
		Select s=new Select(driver.findElement(By.xpath("//div[@class='react-datepicker__header']/div[2]/div[2]/select")));
		s.selectByVisibleText("2003");
		s=new Select(driver.findElement(By.xpath("//div[@class='react-datepicker__header']/div[2]/div[1]/select")));
		s.selectByVisibleText("June");
		driver.findElement(By.xpath("//div[.='15']")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\TRIDIP\\OneDrive\\Pictures\\images (1).jpg");
		Thread.sleep(5000);
		driver.quit();
	}
}
