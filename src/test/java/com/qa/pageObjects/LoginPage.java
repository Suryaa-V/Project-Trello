package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameTextField;

    @FindBy(xpath = "//span[text()='Continue']")
    private WebElement continueButton;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(xpath = "//span[text()='Log in']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        enterText(usernameTextField, username);
    }

    public void clickContinueButton() {
        clickElement(continueButton);
    }

    public void enterPassword(String password) {
        enterText(passwordTextField, password);
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }
}
