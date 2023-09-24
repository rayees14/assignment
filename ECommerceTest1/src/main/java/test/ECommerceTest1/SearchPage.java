package test.ECommerceTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

	 private final WebDriver driver;

	    // Constructor
	    public SearchPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Locators
	    private final By firstProductLocator = By.cssSelector("div._4rR01T");

	    // Methods
	    public void clickFirstProduct() {
	        driver.findElement(firstProductLocator).click();
	    }
}
