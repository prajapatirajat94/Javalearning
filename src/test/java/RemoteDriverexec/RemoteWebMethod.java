package RemoteDriverexec;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebMethod {

	public static void main(String[]args) throws MalformedURLException, InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		System.out.println("*-------------------Program started-------------------*");
		/*To run our Test in Remotewebdriver --> 1.We need to set DesiredCapabilities in program  
		 * cap.setCapability("browserName", "chrome");		
		   cap.setCapability("browserVersion","79.0" );
		   cap.setCapability("enableVNC", true);
		   cap.setCapability(ChromeOptions.CAPABILITY, co);
		 * 2.Set URL -> URL url = new URL("http://localhost:4444/wd/hub");
		 * 3.then pass it on RemoteWebDriver -> RemoteWebDriver driver = new RemoteWebDriver(url,cap); 
		  */
		 
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName", "chrome");		
		cap.setCapability("browserVersion","79.0" );
		cap.setCapability("enableVNC", true);
		cap.setCapability(ChromeOptions.CAPABILITY, co);
		
			URL url = new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,cap); 
		driver.get("https://www.roicians.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.close();
		System.out.println("*------------------Program End--------------------*");
		
	}
	
	
}
