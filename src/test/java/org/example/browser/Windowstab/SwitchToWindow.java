package org.example.browser.Windowstab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class SwitchToWindow {
WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test(priority = 0)
    public void openUrl()throws InterruptedException{

    driver.get("https://www.youtube.com/");
    Thread.sleep(5000);

    }
@Test(priority = 1)
    public void SwitchingNewTab() throws InterruptedException {

        ArrayList<String> window  = new ArrayList<>(driver.getWindowHandles());
        window.add(driver.getWindowHandles().toString());
        driver.switchTo().newWindow(WindowType.WINDOW);
        window.add(driver.getWindowHandles().toString());
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
        Thread.sleep(5000);




        driver.switchTo().window(window.get(0));
        driver.close();
        Thread.sleep(5000);

       // driver.switchTo().window(window.get(1));
       // Thread.sleep(5000);

    }
    @AfterSuite
    public void closeChromeBrowser(){

    driver.quit();

    }

}
