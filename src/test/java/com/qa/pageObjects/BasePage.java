package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utils.ConfigManager;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void clickElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(ConfigManager.getProperty("explicitWait")));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void enterText(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(ConfigManager.getProperty("explicitWait")));
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }
}
