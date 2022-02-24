package pagination.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {	
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");
		driver = new ChromeDriver();
driver.get("https://datatables.net/");
List<WebElement> nameselement =driver.findElements(By.xpath("//td[@class='sorting_1']"));
List<String> names = new ArrayList<String>();
for(WebElement namese:nameselement) {
	names.add(namese.getText());
}

String nexte = driver.findElement(By.id("example_next")).getAttribute("class");
while(!nexte.contains("disabled")) {
	driver.findElement(By.id("example_next")).click();
	nameselement =driver.findElements(By.xpath("//td[@class='sorting_1']"));
	for(WebElement namese:nameselement) {
		names.add(namese.getText());
	}
	
	nexte = driver.findElement(By.id("example_next")).getAttribute("class");
	Thread.sleep(1000);
}
for(String name:names) {
	System.out.println(name);
}
System.out.println("Total num name is " +names.size());
String displaycount = driver.findElement(By.id("example_info")).getText().split(" ")[5];
System.out.println("Total num of display= "+displaycount);
	}
	
	
	
}
