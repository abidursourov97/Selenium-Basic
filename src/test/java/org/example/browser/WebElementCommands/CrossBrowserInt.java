package org.example.browser.WebElementCommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

 public class CrossBrowserInt {

    String url = "https://www.youtube.com/";
    WebDriver driver;
    String browser = System.getProperty("browser","chrome");
@BeforeSuite
    public void startBrowser(String browser){


        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
            driver.manage().window().maximize();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver =new FirefoxDriver();
            driver.manage().window().maximize();
            
        }
        else{
            WebDriverManager.edgedriver().setup();
            driver =new EdgeDriver();
            driver.manage().window().maximize();
        }



    }
    @Test
    public void openUrl()throws InterruptedException{

        driver.get("url");
        Thread.sleep(15000);

    }
    @AfterSuite
    public void closeChromeBrowser(){

        driver.close();

    }
}
