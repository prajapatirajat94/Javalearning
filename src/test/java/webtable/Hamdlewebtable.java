package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hamdlewebtable {
public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
 caldate("11");
	}

	public static void caldate(String date) {
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-datepicker-title']")));
		//driver.findElement(By.xpath("//a[@title='Next']")).click();
		WebElement dn = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));

		 List <WebElement>row =  dn.findElements(By.tagName("tr"));
		 List<WebElement> colum = dn.findElements(By.tagName("td"));		 
		 for(WebElement cell: colum) {
			 if (cell.getText().equals(date)) {
				 cell.findElement(By.linkText(date)).click();	
	}
		 }
		 }
	}
