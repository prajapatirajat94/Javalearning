package dropdownhandle;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownutils {
	
	/**
	 * this method will allow you to select value from dropdown menu by using text.
	 * 
	 * @param element
	 * @param text
	 */
	public static void Dropdownwithvisibletext(WebElement element,String text) {	
		Select select = new Select(element );
		select.selectByVisibleText(text);
	}
	/**
	 * This method will allow to select index from Dropdown menu
	 * @param element
	 * @param index
	 */
	public static void Dropdownwithindex(WebElement element,int index) {	
		Select select = new Select(element );
		select.selectByIndex(index);
	}
	/**
	 * This method will type all option from dropdown
	 * @param element
	 */
	 public static void DropdownOption(WebElement element) {
		 Select select = new Select(element );
		 List<WebElement> allname =select.getOptions();
		 for(int i =0;i<allname.size();i++) {
			 String alloption =allname.get(i).getText();
			 System.out.println(alloption);	 
      }
	 }
	 /**
	  * this method will allow you to execute dropdown by visibletext and by index
	  * @param element
	  * @param type
	  * @param text
	  */
	public static void Dropdownwithselectedtype(WebElement element,String type,String text) {
		Select select = new Select(element );
		switch (type) {
		case "visibletext":
			select.selectByVisibleText(text);
			break;
		case "index":
			select.selectByIndex(Integer.parseInt(text));
			break;
		default:
			System.out.println("enter correct method");
			break;
		}
	}
}
