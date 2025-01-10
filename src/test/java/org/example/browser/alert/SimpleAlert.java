package org.example.browser.alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SimpleAlert {
WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test(priority = 0)
    public void openUrl()throws InterruptedException{

    driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
    Thread.sleep(5000);

    }
@Test(priority = 1)
    public void acceptAlert()throws InterruptedException {


        WebElement alert = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[2]/div[1]/button[1]"));
        alert.click();

        Thread.sleep(5000);
        Alert alert_element = driver.switchTo().alert();

        alert_element.accept();
        Thread.sleep(5000);

    }
    @AfterSuite
    public void closeChromeBrowser(){

    driver.close();

    }

}
