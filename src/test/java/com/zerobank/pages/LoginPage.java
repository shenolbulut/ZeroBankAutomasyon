package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "user_login")
    public WebElement nameInput;
    @FindBy(id = "user_password")
    public WebElement passwordInput;
    @FindBy(xpath = "//div/input[@type='submit']")
    public WebElement submitBtn;
    @FindBy(css = "button#details-button")
    public WebElement advancedBtn;
    @FindBy(css = "a#proceed-link")
    public WebElement proceedToLink;

    public void login(){
        String username= ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        new LoginPage().nameInput.sendKeys(username);
        new LoginPage().passwordInput.sendKeys(password);
        new LoginPage().submitBtn.click();
    }

}
