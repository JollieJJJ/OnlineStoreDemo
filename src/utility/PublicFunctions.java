package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PublicFunctions {
	
	/**
	 * Navigate to specified URL
	 * @param driver
	 * @param URL
	 */
	public void navigateToURL(WebDriver driver, String URL) {
		driver.navigate().to(URL);
	}
	
	/**
	 * Capture the screen shot
	 * @param driver
	 * @param pageName
	 */
	public void captureScreenShot(WebDriver driver, String pageName) {
		try {
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("D:\\Documents\\workspace\\selenium\\OnlineStoreDemo\\screenshot\\" + System.currentTimeMillis() + "-" + pageName + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Move the mouse to one specific element
	 * @param driver
	 * @param element
	 */
	public void mouseHoverToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
}
