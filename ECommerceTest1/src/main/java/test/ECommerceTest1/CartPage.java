package test.ECommerceTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	private final WebDriver driver;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private final By itemincart = By.cssSelector("div.nxl3SA");
    
    // Methods
    public boolean isItemAddedToCart()  {
		return	driver.findElement(itemincart).isDisplayed();
	}
}
