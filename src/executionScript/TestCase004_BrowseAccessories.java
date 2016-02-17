package executionScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import executionAction.AccessoriesPageGridView_Action;
import executionAction.AccessoriesPageListView_Action;

public class TestCase004_BrowseAccessories {
	AccessoriesPageListView_Action aplva = new AccessoriesPageListView_Action();
	AccessoriesPageGridView_Action apgva = new AccessoriesPageGridView_Action();
	
	@Test(priority = 1)
	public void testCase004_BrowseAccessoriesListView() throws Exception {
		WebDriver driver = aplva.driver;
		
		aplva.get();
		
		aplva.assertPageText();
		
		aplva.assertProductContentsListView("004_AccessoriesPage");
		
		driver.close();
	}
	
	@Test(priority = 2)
	public void testCase004_BrowseAccessoriesGridView() throws Exception {
		WebDriver driver = apgva.driver;
		
		apgva.get();
		
		apgva.assertPageText();
		
		apgva.assertProductContentsGridView("004_AccessoriesPage");
		
		driver.close();
	}
}
