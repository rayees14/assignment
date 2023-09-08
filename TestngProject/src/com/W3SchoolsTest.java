package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class W3SchoolsTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test(priority = 1)
    public void searchForW3Schools() {
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchBox.sendKeys("W3Schools");
        searchBox.submit();

        WebElement firstResult = driver.findElement(By.xpath("//div[@class='g'][1]//a"));
        firstResult.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.w3schools.com/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
