package calenderhandling;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandleIxigo {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		// index of calender get chanaged when we click on return
		// while loop is for 2nd calender
		//click departure 
		Selectstartdate("December 2022","7");
		Selectenddate("January 2023","21");
		
				
	}
	public static void Selectstartdate(String Month_Year,String date) {
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
		String Startmonth =driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
		WebElement next = driver.findElement(By.xpath("(//button[@class='ixi-icon-arrow rd-next'])[1]"));
		while(!Startmonth.equals(Month_Year)) {
			next.click();
			Startmonth =driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
			
		}
		List<WebElement>Startdate=driver.findElements(By.xpath("(//div[@class='rd-month'])[1]//"
				+ "div[contains(@class,'day')]"));
		for(WebElement s: Startdate) {
			if(s.getText().equals(date)) {
				s.click();
				break;
			}
		}
	}
	public static void Selectenddate(String Month_Year,String date) {
		driver.findElement(By.xpath("//input[@placeholder='Return']")).click();
		String Endmonth =driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();
		WebElement next2 = driver.findElement(By.xpath("(//button[@class='ixi-icon-arrow rd-next'])[2]"));
		while(!Endmonth.equals(Month_Year)) {
			next2.click();
			Endmonth =driver.findElement(By.xpath("(//div[@class='rd-month-label'])[4]")).getText();
			
		}
		List<WebElement>Enddate=driver.findElements(By.xpath("(//div[@class ='rd-month'])[4]//div"
				+ "[contains(@class,'day')]"));
		for(WebElement e : Enddate) {
			if(e.getText().equals(date)) {
				e.click();
				break;
			}			
	}
	}
	}



