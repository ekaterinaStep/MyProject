package step_definitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import pages.GoogleHomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SearchDefinition {
	
	private WebDriver driver = Driver.getDriver();
	GoogleHomePage GP = new GoogleHomePage();
	
	public static WebElement waitForClickablility(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	
	@Given("^I am on Google Search page$")
	public void i_am_on_Google_Search_page() {
		driver.get(ConfigurationReader.getProperty("url"));
	}

	@Given("^I search for Wooden Spoon$")
	public void i_search_for_Wooden_Spoon() {
		GP.searchBar.sendKeys("wooden spoon"+Keys.ENTER);
	}

	@Given("^I click on Free Shipping$")
	public void i_click_on_Free_Shipping() {
		waitForClickablility(GP.FreeShippingCheckbox, 30);
		GP.FreeShippingCheckbox.click();
	}
}
