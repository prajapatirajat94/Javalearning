package webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabler {
public static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drive","chromedriver.exe");
		driver = new ChromeDriver();
		
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver.get("https://www.w3schools.com/html/html_tables.asp");
//*[@id="customers"]/tbody/tr[2]/td[1]
//*[@id="customers"]/tbody/tr[3]/td[1]
String beforexpath = "//*[@id='customers']/tbody/tr[";
String afterxpath = "]/td[3]";
int rowcount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
int colcount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
System.out.println(colcount);
System.out.println(rowcount);
for(int i=1;i<rowcount;i++) {
	for(int j =1;j<=colcount;j++) {
	String find =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
	if(find.equals("UK")) {
		System.out.println(i+":"+j);
		break;
	}
	}
}
	}
	}


