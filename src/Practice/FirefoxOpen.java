package Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxOpen {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.gecko.driver";
		String value="./Drivers/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(15000);
		driver.close();
	}

}
