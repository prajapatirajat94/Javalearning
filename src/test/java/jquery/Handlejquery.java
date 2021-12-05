package jquery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dropdownhandle.Dropdownutils;
import io.github.bonigarcia.wdm.WebDriverManager;
import utiliy.Util;

public class Handlejquery {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//input[@id ='justAnInputBox']")).click();

		SelectCheckbox(driver,"all");

	}
public static void SelectCheckbox(WebDriver driver,String... value) {
	List<WebElement> list =driver.findElements(By.xpath("//ul//span[@class='comboTreeItemTitle']"));
	if(!(value[0].equalsIgnoreCase("All"))) {
		for(int i =0;i<list.size();i++) {
			String checkbox =list.get(i).getText();
			for(int k=0;k<value.length;k++) {		
				if(checkbox.equals(value[k])) {
					list.get(i).click();
					break;
				}
			}			
		}
	}
	else {
		try {
		for(int i =0;i<list.size();i++) {
			list.get(i).click();
		
	}
		}
		catch(Exception e) {
			
		}
		}
}}
