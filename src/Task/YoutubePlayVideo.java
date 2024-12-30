package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubePlayVideo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("pushpa 2 trailer");
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[title='Pushpa 2 - The Rule Trailer (Hindi) | Allu Arjun | Sukumar | Rashmika Mandanna | Fahadh Faasil | DSP'")).click();
	}
}
