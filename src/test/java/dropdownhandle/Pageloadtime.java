package dropdownhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Pageloadtime {

	
	public static void pagetime(WebDriver driver, int time) {
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
}
