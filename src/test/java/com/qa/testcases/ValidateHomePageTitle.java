package com.qa.testcases;

import com.qa.baseclass.BaseTestClass;
import com.qa.utils.ConfigManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateHomePageTitle extends BaseTestClass {

    @Test(priority = 1)
    public void validateHomePageTitle() {
        driver.get(ConfigManager.getProperty("appUrl"));
        Assert.assertEquals(driver.getTitle(), ConfigManager.getProperty("homePageTitle"));
    }
}
