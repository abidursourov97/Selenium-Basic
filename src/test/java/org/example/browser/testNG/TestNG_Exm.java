package org.example.browser.testNG;

import org.testng.annotations.*;

public class TestNG_Exm {
    @AfterSuite
    public void afterSuiteExm(){
        System.out.println("after suite ");

    }
    @Test(priority = 1)
    public void textExm(){
        System.out.println("Text Exm");

    }
    @Test(priority = 0)
    public void textExm2() {
        System.out.println("Text Exm2");
    }

     @BeforeTest
     public void beforeTextExm(){
        System.out.println("Before text exm");
     }
     @AfterTest
     public void afterTextExm(){
        System.out.println("After Text Exm");
     }

     @BeforeMethod
     public void beforeMethodExm(){
        System.out.println("Before Method Exm");
     }
     @AfterMethod
     public void afterMethodExm(){
        System.out.println("After Method Exm");
     }
    @BeforeSuite
    public void beforeSuiteExm(){
    System.out.println("Before Suite Exm");
    }
    @BeforeClass
    public void beforeClassExm(){
        System.out.println("Before Class Exm");

    }
    @AfterClass
    public void AfterClassExm(){
        System.out.println("After class Exm");
    }
}

