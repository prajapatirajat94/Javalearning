import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FrameHandler {

    /**
     * This method searches for an element inside nested iframes and clicks on it.
     * It automatically traverses through all iframes until the element is found.
     * 
     * @param driver         - Instance of WebDriver
     * @param elementLocator - By locator for the element to be clicked
     * @return boolean       - Returns true if the element was found and clicked, false otherwise
     */
    public static boolean clickElementInUnknownNestedIframe(WebDriver driver, By elementLocator) {
        return searchAndClickElement(driver, elementLocator, driver.findElements(By.tagName("iframe")));
    }

    private static boolean searchAndClickElement(WebDriver driver, By elementLocator, List<WebElement> iframes) {
        for (WebElement iframe : iframes) {
            try {
                // Switch to the current iframe
                driver.switchTo().frame(iframe);

                // Try to find the element in the current iframe
                WebElement element = driver.findElement(elementLocator);
                element.click();
                return true; // Element found and clicked

            } catch (NoSuchElementException e) {
                // Element not found in the current iframe, move on
            }

            // Recursively search in nested iframes within the current iframe
            List<WebElement> nestedIframes = driver.findElements(By.tagName("iframe"));
            if (nestedIframes.size() > 0) {
                if (searchAndClickElement(driver, elementLocator, nestedIframes)) {
                    return true; // Element found and clicked in a nested iframe
                }
            }

            // Switch back to the parent frame if the element wasn't found
            driver.switchTo().parentFrame();
        }

        return false; // Element not found in any of the iframes
    }
}