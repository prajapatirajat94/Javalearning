package dropdownhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import utiliy.Util;

public class Dropdownpractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	
		WebElement Country = driver.findElement(By.id("Form_submitForm_Country"));
		WebElement States = driver.findElement(By.id("Form_submitForm_State"));
		Util util = new Util(driver);
		String title =util.waitforTitlepresent("Orange", 10);
		System.out.println(title);
		Dropdownutils.Dropdownwithselectedtype(Country,Dropdown.VISIBLETEXT.toString(), "India");
		Dropdownutils.Dropdownwithindex(States, 5);
		//Dropdownutils.Dropdownwithselectedtype(States,"visibletext", "Gujarat");
	}
	

}
