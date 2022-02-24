package pagination.java;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Page {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");
		driver = new ChromeDriver();
driver.get("https://datatables.net/");
List<WebElement> names = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
List<String> namelist= new ArrayList<String>();
for(WebElement namese:names) {
	namelist.add(namese.getText());
}
String next = driver.findElement(By.id("example_next")).getAttribute("class");
while(!next.contains("disabled")) {
	driver.findElement(By.id("example_next")).click();
	names = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
	for(WebElement namese:names) {
		namelist.add(namese.getText());
	}
	next = driver.findElement(By.id("example_next")).getAttribute("class");
	Thread.sleep(2000);
}
for(String allanme :namelist) {
	System.out.println(allanme);
}
System.out.println(namelist.size());
String display = driver.findElement(By.id("example_info")).getText().split(" ")[5];
System.out.println(display);

}

}
