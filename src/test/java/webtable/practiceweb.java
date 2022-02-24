package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceweb {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
//driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();		
//*[@id="customers"]/tbody/tr[2]/td[1]
//*[@id="customers"]/tbody/tr[3]/td[1]
System.out.println(typenamecell("Germany"));

	}
	public static boolean typenamecell(String tpname) {
		List<WebElement>rowcount =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		List<WebElement>colcount =driver.findElements(By.xpath("//table[@id='customers']//th"));
		boolean flag = false;
		for(int i =1;i<rowcount.size();i++) {
			for(int j=1;j<=colcount.size();j++) {
			String data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
			if(data.equals(tpname)) {
				flag = true;
				System.out.println(i +":"+ j);
				break;
			}
			}
		    }	
if(flag) {
			return true;
		}
		return flag;
	}
}
