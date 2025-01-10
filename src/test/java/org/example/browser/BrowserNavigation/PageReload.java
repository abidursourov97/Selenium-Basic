package org.example.browser.BrowserNavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PageReload {
    WebDriver driver;
    @BeforeSuite
    public void startChromeBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void openUrl()throws InterruptedException{

        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(5000);

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(5000);

        driver.navigate().back();
        Thread.sleep(5000);

        driver.navigate().refresh();
        Thread.sleep(5000);
    }
    @AfterSuite
    public void closeChromeBrowser(){

        driver.close();

    }


}
