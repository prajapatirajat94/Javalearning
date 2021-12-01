package handling.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaHandkingWindows {
public static WebDriver driver;
	public static void main(String[] args) {	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Set<String> handles =driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String parentwindow =it.next();
		String childwindow = it.next();
		
	}

}
