package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kms.katalon.core.webui.driver.DriverFactory;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;


public class SimpleTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.out.println("Set up");
       
        WebUiBuiltInKeywords.openBrowser("");
 
        driver = DriverFactory.getWebDriver();
     
    }

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
        driver.get("http://www.google.com");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
