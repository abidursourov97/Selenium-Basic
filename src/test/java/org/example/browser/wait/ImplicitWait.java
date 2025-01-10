package org.example.browser.wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;


public class ImplicitWait {
WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void openUrl()throws InterruptedException{

    driver.get("https://www.daraz.com.bd/?_mkt_tracker=g&_mkt_campaign=11322136206&_mkt_adgroup=113762568369&_mkt_creative=621278777734&_mkt_src=gg&isdl=y&aff_short_key=_7agwc&gclid=Cj0KCQjw4s-kBhDqARIsAN-ipH0IZL6b0aDQZxHYCwgm8MC6PVX4J6Gbl9IFErBdwUJ7Cewumf845AMaAu45EALw_wcB#?");
    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

    }
    @AfterSuite
    public void closeChromeBrowser(){

    driver.close();

    }

}
