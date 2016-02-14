package executionScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import executionAction.MainPage_Action;

public class TestCase003_MainPageElements {
	MainPage_Action mpa = new MainPage_Action();
	WebDriver driver = mpa.driver;
	
	@Test
	public void testCase003_MainPageElements() {
		mpa.get();
		
		mpa.assertMainPageNavBarElements();
		
		driver.close();
	}
}
