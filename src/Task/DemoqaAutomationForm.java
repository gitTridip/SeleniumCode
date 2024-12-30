package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaAutomationForm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Tridip");
		driver.findElement(By.id("lastName")).sendKeys("Pramanik");
		driver.findElement(By.id("userEmail")).sendKeys("kjdshg@kdmf.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("5464982167");
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Eng");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'English')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("bfdhvjbbv kjdshfgvkb\n jdbfvjsbd");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
