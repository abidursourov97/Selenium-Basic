package org.example.browser.Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class FrameLoacteByID {
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



        driver.switchTo().frame("frm2");
        WebElement element = driver.findElement(By.xpath("//input[@id='firstName']"));
        element.sendKeys("sourov");
        Thread.sleep(5000);

    }
    @AfterSuite
    public void closeChromeBrowser(){

    driver.close();

    }

}
