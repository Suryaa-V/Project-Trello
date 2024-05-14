package com.qa.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyTestClass {
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeSuite
    public void setup() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @Test
    public void testMethod() {
        test = extent.createTest("My Test", "This is a sample test.");
        test.log(Status.INFO, "Starting test...");
        // Your test logic goes here
        test.log(Status.PASS, "Test passed.");
    }

    @AfterSuite
    public void tearDown() {
        extent.flush();
    }
}
