package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class GoogleHomePage {
private WebDriver driver;
	
	public GoogleHomePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="search-query")
	public WebElement searchBar;
	
	@FindBy (xpath="//a[@href='https://www.etsy.com/search?q=wooden+spoon&explicit=1&free_shipping=true']")
	public WebElement FreeShippingCheckbox;
	
}