package org.example.browser.WebElementCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HeadlessChromeBrowser {
   WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser(){

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

    }
    @Test
    public void openUrl()throws InterruptedException{

        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);
     System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
    @AfterSuite
    public void closeChromeBrowser(){

        driver.close();

    }
}
