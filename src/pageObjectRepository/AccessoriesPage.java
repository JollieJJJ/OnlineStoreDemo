package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccessoriesPage {
	@FindBy(xpath = ".//*[@id='post-105']/header/h1")
	public WebElement txtHeader;
}
