package javastreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonJavaStream {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		By links = By.tagName("a");
		List<WebElement>linklist=driver.findElements(links);
	/*List<String> collectionlist=linklist.stream()
		.filter(ele -> !ele.getText().equals("") && ele.getText().contains("Amazon"))
		.map(ele-> ele.getText())
		.collect(Collectors.toList());*/
		List<String> collectionlist=linklist.stream()
				.filter(ele -> !ele.getText().isEmpty())
				.filter(ele-> ele.getText().startsWith("Amazon"))
				.map(ele-> ele.getText().trim())
				.collect(Collectors.toList());
	collectionlist.parallelStream().forEach(ele -> System.out.println(ele));

	}

}
