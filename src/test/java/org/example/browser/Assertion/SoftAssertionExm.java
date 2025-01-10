package org.example.browser.Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertionExm {
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

        String expectedtitle = "Selenium Practice - Student Registration Form";
        String actulatitle = driver.getTitle();

        SoftAssert softAssert = new SoftAssert();

        WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
        element.sendKeys("Abidur");
        Thread.sleep(5000);



    }
    @AfterSuite
    public void closeChromeBrowser(){

        driver.close();

    }


}
