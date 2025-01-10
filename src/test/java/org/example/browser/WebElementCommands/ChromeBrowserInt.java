package org.example.browser.WebElementCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class ChromeBrowserInt {
WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void openUrl()throws InterruptedException{

    driver.get("https://www.youtube.com/");
    Thread.sleep(15000);

    }
    @AfterSuite
    public void closeChromeBrowser(){

    driver.close();

    }

}
