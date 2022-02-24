package pagination.java;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Prpractice {
public static WebDriver driver;
	public static void main (String []args) {
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");
		driver = new ChromeDriver();
driver.get("https://datatables.net/");
List<WebElement>Rowname = driver.findElements(By.xpath("//td[@class='sorting_1']"));
List<String>name=new ArrayList<String>();
for(WebElement e : Rowname) {
	name.add(e.getText());
}
String next =driver.findElement(By.xpath("//a[@id='example_next']")).getAttribute("class");
while(!next.contains("disable")) {
	driver.findElement(By.xpath("//a[@id='example_next']")).click();
	Rowname = driver.findElements(By.xpath("//td[@class='sorting_1']"));
	for(WebElement e : Rowname) {
		name.add(e.getText());
}
	next =driver.findElement(By.xpath("//a[@id='example_next']")).getAttribute("class");	
	}
name.forEach(m-> System.out.println(m));
System.out.println(name.size());
}
}
