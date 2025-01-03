package Task;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterMultipleAccountInDemoWebShop {
	static String path;
	static String value;
	static String presentUser;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		path="C:\\Users\\TRIDIP\\OneDrive\\Documents\\TestData.xlsx";
		
		for(int i=1;i<=10;i++) {
			driver.findElement(By.xpath("//a[.='Register']")).click();
			
			int cell=0;
			driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(value("Sheet1",i,cell++));
			driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(value("Sheet1",i,cell++));
			presentUser =value("Sheet1",i,cell++);
			driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(presentUser);
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(value("Sheet1",i,cell++));
			driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(value("Sheet1",i,cell++),Keys.ENTER);
			try {
				Thread.sleep(750);
				driver.findElement(By.xpath("//input[@value='Continue']")).click();
				Thread.sleep(750);
				driver.findElement(By.className("ico-logout")).click();
				Thread.sleep(750);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			catch (NoSuchElementException e) {
				System.out.println("Account already registered for "+presentUser);
			}
		}
		driver.quit();
	}
	static String value(String sheet,int row,int cell) {
		try {
			FileInputStream testsheet=new FileInputStream(path);
			value = WorkbookFactory.create(testsheet).getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
}
