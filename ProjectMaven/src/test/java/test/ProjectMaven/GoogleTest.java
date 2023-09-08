package test.ProjectMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test(priority = 1)
    public void testGoogleLogo() {
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test(priority = 2)
    public void testSearchBox() {
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        Assert.assertTrue(searchBox.isDisplayed());
    }

    @Test(priority = 3)
    public void testButtonNames() {
        WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Google Search']"));
        WebElement luckyBtn = driver.findElement(By.xpath("//input[@value=\"I'm Feeling Lucky\"]"));

        Assert.assertEquals(searchBtn.getAttribute("value"), "Google Search");
        Assert.assertEquals(luckyBtn.getAttribute("value"), "I'm Feeling Lucky");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
