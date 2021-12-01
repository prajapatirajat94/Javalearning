package getattibutepr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonget {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	 driver.get("https://www.amazon.ca/");
	 List<WebElement> links= driver.findElements(By.tagName("a"));
	 System.out.println(links.size());
	 for(int i =0;i<links.size();i++) { 
		String amz = links.get(i).getText();
		 if(!(amz.isEmpty()||amz.equals(null))) {
			System.out.println(amz);
			
		 }	
		 
	 }
		 
	}

}
