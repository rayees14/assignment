package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearchTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        // Set up ChromeOptions if needed
        ChromeOptions options = new ChromeOptions();
        // Add options if required, e.g., headless mode

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Navigate to Google
        driver.get("https://www.google.com");
        
        // Locate the search box element using XPath
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

        // Enter "W3Schools" in the search box
        searchBox.sendKeys("W3Schools");
        searchBox.submit();

        // Locate the first search result link using XPath
        WebElement firstSearchResult = driver.findElement(By.xpath("//h3[contains(text(),'W3Schools')]"));

        // Click on the first search result
        firstSearchResult.click();

        // Get the current URL after clicking the link
        String currentURL = driver.getCurrentUrl();

        // Verify if it navigated to the W3Schools URL
        if (currentURL.equals("https://www.w3schools.com/")) {
            System.out.println("Successfully navigated to W3Schools.");
        } else {
            System.out.println("Navigation to W3Schools failed.");
        }

        // Close the WebDriver
        driver.quit();
    }
 }


