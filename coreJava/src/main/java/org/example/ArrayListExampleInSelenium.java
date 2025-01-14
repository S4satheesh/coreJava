package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleInSelenium {

    public static void main(String[] args) {
        // Setup WebDriver (Assuming you have the correct WebDriver executable)
        //System.setProperty("Webdriver.chrome.driver", "path/to/chromedriver");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to a sample website
        driver.get("https://www.irctc.co.in/nget/train-search");

        // Find all the links on the page
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));

        // Create an ArrayList to store the text of the links
        ArrayList<String> linksText = new ArrayList<String>();

        // Loop through each link and get the text, adding it to the ArrayList
        for (WebElement link : linkElements) {
            String linkText = link.getText();
            // Only add non-empty link texts to the ArrayList
            if (!linkText.isEmpty()) {
                linksText.add(linkText);
            }
        }

        // Now we can perform actions on the ArrayList data
        // For example, print all the link texts
        System.out.println("Links on the page:");
        for (String link : linksText) {
            System.out.println(link);
        }

        // Close the browser
        driver.quit();
    }
}

