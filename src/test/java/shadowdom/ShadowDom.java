package shadowdom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDom {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.switchTo().frame("pact");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
 
       WebElement element = (WebElement) jse.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
       String js ="arguments[0].setAttribute('value','Love Samosa')";
       jse.executeScript(js, element);
      WebElement element2= (WebElement) jse.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
	String js1 = "arguments[0].setAttribute('value','Dinner time')";
	jse.executeScript(js1, element2);
	
	}

}
