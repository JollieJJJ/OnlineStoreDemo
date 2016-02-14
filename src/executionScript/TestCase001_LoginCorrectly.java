package executionScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import executionAction.Login_Action;

public class TestCase001_LoginCorrectly {
	Login_Action la = new Login_Action();
	WebDriver driver = la.driver;
	
	@Test
	public void testCase001_Login() throws Exception {
		la.get();
		
		la.assertMainPageURL();
		
		la.testLogin("001_LoginCorrectly");

		driver.close();
	}
}
