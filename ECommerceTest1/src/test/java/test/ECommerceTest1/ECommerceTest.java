package test.ECommerceTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ECommerceTest {
    private WebDriver driver;
    private HomePage homePage;
    private SearchPage searchPage;
    private ProductPage productPage;
    private CartPage cartPage;

    @BeforeSuite
    public void setUp() {
    	
        // Initialize WebDriver
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Initialize Page Object
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }
    
    	// Verify Flipkart Logo
    	@Test(priority = 1)
    	public void verifyFlipkartLogo()  {
    	
    	// Open the home page
        homePage.openHomePage("https://www.flipkart.com/");
        System. out. println("Flipkart launched Successfully");
        
    	// Close Login Pop-Up
        homePage.closeloginpopup();
        System. out. println("Login Pop-Up closed Successfully");
        
    	// Verify Flipkart logo is displayed
        Assert.assertTrue(homePage.isFlipkartLogoPresent());
        System. out. println("Flipkart logo is displayed Successfully");
    	}

        // Enter Text-Box and Search text
    	@Test(priority=2)
    	 public void verifyTextBoxandSearch() throws InterruptedException {
        homePage.enterSearchText("Macbook air m2");
        System. out. println("Product searched Successfully");
    	}

        //  Click on the first displayed item
        @Test(priority = 3)
        public void verifyClickOnFirstDisplayedItem() {
        searchPage.clickFirstProduct();
        System. out. println("Clicked on First Product Successfully");
        }

        // Click on Add To Cart button
        @Test(priority = 4)
        public void verifyAddToCart() throws InterruptedException {
        productPage.addToCart();
        System. out. println("Clicked on add to cart Successfully");
        }
        
        // Verify that item has been added to cart
        @Test(priority = 5)
        public void verifyProductInCart() {
        Assert.assertTrue(cartPage.isItemAddedToCart());
        System. out. println("Product Added to Cart Successfully");
        }

    @AfterSuite
    public void tearDown() {
        // Quit the WebDriver
        driver.quit();
    }
}
