package org.example.browser.Tables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;


public class FetchColumnValue {
WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test(priority = 0)
    public void openUrl()throws InterruptedException{

    driver.get("https://www.demo.guru99.com/test/web-table-element.php");
    Thread.sleep(5000);

    }
    @Test(priority = 1)
    public void fetchHeadingOfTable(){

        List<WebElement> numberOfRows =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        System.out.println("number of rows"+ numberOfRows);
        for (int i=1; i<=numberOfRows.size(); i++) {
            WebElement companyname =driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[1]/a"));
String cellValue = companyname.getText();
            System.out.println("Company Name  :"+ cellValue);
        }

    }
    @AfterSuite
    public void closeChromeBrowser(){

    driver.quit();


    }

}
