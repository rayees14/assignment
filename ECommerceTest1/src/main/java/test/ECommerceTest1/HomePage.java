package test.ECommerceTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private final By flipkartlogo = By.cssSelector("img[title='Flipkart']");
    private final By searchBoxLocator = By.name("q");
    private final By submitbuttorforsearch = By.cssSelector("button[type='submit']");

    // Methods
    public void openHomePage(String url) {
        driver.get(url);
    }
    
    public void closeloginpopup()  {
		driver.findElement(By.cssSelector("span._30XB9F")).click();
    }
    
    public boolean isFlipkartLogoPresent() {
    	return driver.findElement(flipkartlogo).isDisplayed();
    	
    }

    public void enterSearchText(String searchText) throws InterruptedException {
        driver.findElement(searchBoxLocator).sendKeys(searchText);
        driver.findElement(submitbuttorforsearch).click();
        Thread.sleep(2000);
    }
    

}
