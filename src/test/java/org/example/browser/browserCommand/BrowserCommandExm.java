package org.example.browser.browserCommand;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowserCommandExm {

    String url = "https://www.youtube.com/";

    WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
@Test
    public void getCurrentUrl () throws InterruptedException {
        driver.get(url);
        Thread.sleep(1000);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        if (url.equals(currentUrl)){
            System.out.println("current url is the same as the mentioned url");
        }else {
            System.out.println("Current url is not same as mentioned url");
        }


    }
    @Test
    public void getPageSource() throws InterruptedException {
        System.out.println(driver.getPageSource());
    }
    @AfterSuite
    public void closeChromeBrowser(){
        driver.quit();
    }
}
