package org.example.browser.Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;


public class FrameLoacteByCount {
WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void openUrl()throws InterruptedException{

    driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
    Thread.sleep(15000);

        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        System.out.println(iframes.size());


    }
    @AfterSuite
    public void closeChromeBrowser(){

    driver.close();

    }

}
