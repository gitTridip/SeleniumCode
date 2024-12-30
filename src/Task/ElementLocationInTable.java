package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import Generic.GenericOpen;

public class ElementLocationInTable {
	public static void main(String[] args) {
		WebDriver driver=GenericOpen.chrome();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int tr=2;
		int td=1;
		while(true) {
			String xpath="//table[@id=\"customers\"]/tbody/tr["+tr+"]/td["+td+"]";
			if(((driver.findElement(By.xpath(xpath))).getText()).equals("Alfreds Futterkiste")) {
				System.out.println("Row: "+(tr-1)+", Column:"+td);
				break;
			}
			if(td==3) {
				tr++;
				td=1;
			}
			else
				td++;
		}
//		String [][]arr=new String[6][3];
//		List<WebElement> l=driver.findElements(By.xpath("(//tbody)[1]/tr/td"));
//		int i=0;
//		int j=0;
//		for(WebElement w:l) {
//			arr[i][j]=w.getText();
//			if(j==2) {
//				i++;
//				j=0;
//			}
//			else
//				j++;
//		}
//		for(int k=0;k<6;k++) {
//			for(int m=0;m<3;m++) {
//				if(arr[k][m].equals("Laughing Bacchus Winecellars")) {
//					System.out.println("row:"+(k+1)+", column:"+(m+1));
//				}
//			}
//		}
		driver.quit();
	}
}
