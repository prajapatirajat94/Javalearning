package webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectcalenderby {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver.get("https://www.spicejet.com/");
String dt = "my name";
WebElement datef = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div"
		+ "[3]/div[2]/div[4]/div/div/div[1]/div[2]/div[1]"));
//datef.click();
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('Text','Fri, 8 Nov 2021');", datef);
	}

	
}
