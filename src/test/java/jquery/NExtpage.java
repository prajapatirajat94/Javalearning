package jquery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utiliy.Util;

public class NExtpage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		By clicknext = By.xpath("(//div[contains(@class,'navigation')])[3]");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h3[text()='Recommended for you']")));
		Util web = new Util(driver);	
		web.waitforElementpresent(clicknext, 20);
		//web.waitforElementTobeclickable(clicknext, 20);
		//web.waitforElementTobevisibilitylocated(clicknext, 20);
	//	Actions action = new Actions(driver);
	//	action.click(driver.findElement(clicknext)).build().perform();
	 driver.findElement(clicknext).click();
	 driver.findElement(clicknext).click();
		
	}

}
