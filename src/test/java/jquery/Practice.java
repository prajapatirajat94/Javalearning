package jquery;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
public static WebDriver driver;
public static void main(String[]args) {
	System.out.println("*------------------Program start----------------------------*");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	driver.findElement(By.xpath("//input[@id ='justAnInputBox']")).click();
	selectcheckbox(driver,"Choice 1","Choice 2");
	driver.close();
	System.out.println("*------------------------Program End----------------------*");
	
	
}
public static void selectcheckbox(WebDriver driver,String...selectc) {
	List<WebElement>list=driver.findElements(By.xpath("//ul//span[@class='comboTreeItemTitle']"));
	if(!(selectc[0].equalsIgnoreCase("all"))){
		
		for(int i=0;i<list.size();i++) {
			String checkbox =list.get(i).getText();
		    for(int k=0;k<selectc.length;k++) {
		    	if(selectc[k].equalsIgnoreCase(checkbox)) {
		    		list.get(i).click();
		    		break;
		    	}
			   
		   }		
		}	
	}
	else {
		try {
		for(int i=0;i<list.size();i++) {
			list.get(i).click();
		}}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
}
