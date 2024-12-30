package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeFirefoxOpen {

	public static void main(String[] args) throws InterruptedException {
		//Chrome open
		String key="webdriver.chrome.driver";
		String value="./Drivers/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		//Thread.sleep(10000);
		driver.close();
		//Firefox open
		String key1="webdriver.gecko.driver";
		String value1="./Drivers/geckodriver.exe";
		System.setProperty(key1, value1);
		FirefoxDriver driver1=new FirefoxDriver();
		//Thread.sleep(15000);
		driver1.close();
	}

}
