package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Generic.GenericOpen;

public class ComparePriceofTwoEcomerceWebsite {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=GenericOpen.chrome();
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("samsung galaxy s23 fe graphite 128 gb",Keys.ENTER);
		String Fprice = driver.findElement(By.xpath("//span[.='Sort By']/../../../../following-sibling::div[1]//div/a/div[3]/div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println(Fprice);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung galaxy s23 fe graphite 128 gb",Keys.ENTER);
		String Aprice=driver.findElement(By.xpath("//span[.='Samsung Galaxy S23 FE 5G (Graphite 128 GB Storage) (8 GB RAM)']/../../../following-sibling::div[2]/div[1]/div/div[1]/div[1]/div[1]/a/span[1]/span[2]/span[2]")).getText();
		System.out.println(Aprice);
		driver.quit();
		String empty="";
		for(int i=0;i<Fprice.length();i++) {
			if(Fprice.charAt(i)!='₹' && Fprice.charAt(i)!=',') {
				empty=empty+Fprice.charAt(i);
			}
		}
		Fprice=empty;
		empty="";
		for(int i=0;i<Aprice.length();i++) {
			if(Aprice.charAt(i)!='₹' && Aprice.charAt(i)!=',') {
				empty=empty+Aprice.charAt(i);
			}
		}
		Aprice=empty;
		int fp=Integer.parseInt(Fprice);
		int ap=Integer.parseInt(Aprice);
		if(fp>ap)
			System.out.println("Flipkart is showing "+(fp-ap)+" rs. more than Amazon");
		else if(ap>fp)
			System.out.println("Amazon is showing "+(ap-fp)+" rs. more than Flipkart");
		else
			System.out.println("Both platform showing same price");
		
	}
}