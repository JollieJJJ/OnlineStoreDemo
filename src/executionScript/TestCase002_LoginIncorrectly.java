package executionScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import executionAction.Login_Action;

public class TestCase002_LoginIncorrectly {
	Login_Action la = new Login_Action();
	WebDriver driver = la.driver;
	
	@Test
	public void testCase001_Login() throws Exception {
		la.get();
		
		la.assertMainPageURL();
		
		la.testLogin("002_LoginIncorrectly");

		driver.close();
	}
}
