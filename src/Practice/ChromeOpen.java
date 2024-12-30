package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOpen {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(10000);
		driver.close();

	}

}
