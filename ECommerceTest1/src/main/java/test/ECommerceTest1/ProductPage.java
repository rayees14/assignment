package test.ECommerceTest1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	private final WebDriver driver;

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
	private final By addToCartButtonLocator = By.cssSelector("button._2KpZ6l._2U9uOA._3v1-ww");
	private final By clickoncart = By.cssSelector("path._1bS9ic");
	
	 // Methods
	public void addToCart() throws InterruptedException {
		
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(1));
		
		driver.findElement(addToCartButtonLocator).click();
		Thread.sleep(2000);
		driver.findElement(clickoncart).click();
		Thread.sleep(2000);
			
	}

}
