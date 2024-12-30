package Practice;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class ResizeApplication {
	public static void main(String[] args) {
		ArrayList<Dimension> al=new ArrayList<Dimension>();
		al.add(new Dimension(1920, 1080));
		al.add(new Dimension(1680, 1050));
		al.add(new Dimension(1600, 900));
		al.add(new Dimension(1440, 900));
		al.add(new Dimension(1400, 1050));
		al.add(new Dimension(1366, 768));
		al.add(new Dimension(1360, 768));
		al.add(new Dimension(1280, 1024));
		al.add(new Dimension(1280, 960));
		al.add(new Dimension(1280, 800));
		al.add(new Dimension(1280, 768));
		al.add(new Dimension(1280, 720));
		al.add(new Dimension(1280, 600));
		al.add(new Dimension(1152, 864));
		al.add(new Dimension(1024, 768));
		al.add(new Dimension(800, 600));
		WebDriver driver=GenericOpen.chrome();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		for(Dimension d:al) {
			driver.manage().window().setSize(d);
		}
		driver.quit();
	}
}
