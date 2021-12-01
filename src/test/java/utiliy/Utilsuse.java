package utiliy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dropdownhandle.Pageloadtime;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilsuse {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Pageloadtime.pagetime(driver, 10);
		By name =By.id("Form_submitForm_Name");
		By email =By.id("Form_submitForm_Email");
		Util utils = new Util(driver);
		utils.waitforElementpresent(name, 10);
		utils.doSendkeys(name, "Rajat");
		utils.doSendkeys(email, "test@gmail.com");
		

	}

}
