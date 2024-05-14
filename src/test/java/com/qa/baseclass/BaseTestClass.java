package com.qa.baseclass;

import com.qa.utils.ConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTestClass {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
    	 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

         ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigManager.getProperty("implicitWait")), TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
