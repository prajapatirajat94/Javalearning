package utiliy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver;
	public Util(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * This method will return webelement just passing By locator 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
		element =driver.findElement(locator);
		}
		catch(Exception e) {
			System.out.println("some exception is coming in weblement");
		System.out.println(e.getMessage());	
		}
		return element;
	}
	/**
	 * 
	 * @param locator
	 * @param timeout
	 * @return 
	 */
	public WebElement waitforElementpresent(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return getElement(locator);
	}
	/**
	 * this will wait for to element clickable
	 * @param locator
	 * @param timeout
	 * @return 
	 */
	public WebElement waitforElementTobeclickable(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return getElement(locator);
	}
	public void clickwhenReady(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		getElement(locator).click();
	}
	/**
	 * this will check visiblity of element on page as well available in dom
	 * @param element
	 * @param timeout
	 * @return 
	 */
	public WebElement waitforElementTobevisible(WebElement element,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	public WebElement waitforElementTobevisibilitylocated(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return getElement(locator);
	}
	public String waitforTitlepresent(String title,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	/**
	 * This method will allow you to send text
	 * @param locator
	 * @param value
	 */
	public void doSendkeys(By locator,String value) {
		try {
		getElement(locator).sendKeys(value);
		}
		catch(Exception e) {
			System.out.println("some exception is coming in sendkeys");
			System.out.println(e.getMessage());
		}
	}
	/**
	 * This method will perform click by passing locator
	 * @param locator
	 */
	public void doClick(By locator) {
	try {	
	getElement(locator).click();
	}
	catch(Exception e) {
		System.out.println("some exception is coming in click");
		System.out.println(e.getMessage());
	}
	}
}

