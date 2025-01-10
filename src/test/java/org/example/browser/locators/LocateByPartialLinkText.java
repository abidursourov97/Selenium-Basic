package org.example.browser.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LocateByPartialLinkText {
    WebDriver driver;
    @BeforeSuite
    public void startChromeBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void openUrl()throws InterruptedException{

        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.partialLinkText("Bad"));
        element.click();
        Thread.sleep(5000);
    }
    @AfterSuite
    public void closeChromeBrowser(){

        driver.close();

    }


}
