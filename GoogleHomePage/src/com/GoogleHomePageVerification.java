package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageVerification {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google homepage
        driver.get("https://www.google.com/");

        // Verify Google logo is present
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));
        if (logo.isDisplayed()) {
            System.out.println("Google logo is present.");
        } else {
            System.out.println("Google logo is not present.");
        }

        // Verify search text box is present
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        if (searchBox.isDisplayed()) {
            System.out.println("Search Text box is present.");
        } else {
            System.out.println("Search Text box is not present.");
        }

        // Verify the "Google Search" button
        WebElement googleSearchButton = driver.findElement(By.xpath("//input[@name='btnK']"));
        if (googleSearchButton.getAttribute("value").equals("Google Search")) {
            System.out.println("Google Search button is present.");
        } else {
            System.out.println("Google Search button is not present.");
        }

        // Verify the "I'm Feeling Lucky" button
        WebElement feelingLuckyButton = driver.findElement(By.xpath("//input[@name='btnI']"));
        if (feelingLuckyButton.getAttribute("value").equals("I'm Feeling Lucky")) {
            System.out.println("I'm Feeling Lucky button is present.");
        } else {
            System.out.println("I'm Feeling Lucky button is not present.");
        }

        // Close the browser
        driver.quit();
    }
}
