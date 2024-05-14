package com.qa.testcases;

import com.qa.baseclass.BaseTestClass;
import com.qa.pageObjects.HomePage;
import com.qa.pageObjects.LoginPage;
import com.qa.utils.ConfigManager;
import com.qa.utils.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLoginTest extends BaseTestClass {

    @Test(priority = 1)
    public void validateLoginTitle() {
        driver.get(ConfigManager.getProperty("appUrl"));
        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();
        Assert.assertEquals(driver.getTitle(), ConfigManager.getProperty("loginPageTitle"));
    }

    @Test(priority = 2)
    public void enterValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(TestData.VALID_USERNAME);
        loginPage.clickContinueButton();
        loginPage.enterPassword(TestData.VALID_PASSWORD);
        loginPage.clickLoginButton();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        Assert.assertEquals(driver.getTitle(), ConfigManager.getProperty("boardPageTitle"));
    }
}
