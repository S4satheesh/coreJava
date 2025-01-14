package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

import static java.util.concurrent.TimeUnit.SECONDS;

public class WindowsHandle {

    public static void main(String[] arg)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).click();
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("amazon");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.RETURN);
        String mainTab = driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().newWindow(WindowType.TAB);
// Opens LambdaTest homepage in the newly opened window
        driver.navigate().to("https://www.lambdatest.com/");
        Set<String> mainWindow = driver.getWindowHandles();

        System.out.println(mainWindow);

        for(String handle: mainWindow)
            if(!handle.equals(mainTab))
            {
                driver.switchTo().window(mainTab);
            }
        //driver.quit();


    }
}
