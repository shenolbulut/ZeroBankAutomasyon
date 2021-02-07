package com.zerobank.step_definitions;

import com.zerobank.pages.FirstPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class NegativeLoginScenarioDef {
    @Given("the user goes to first page")
    public void the_user_goes_to_first_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("the user clicks the sign button and verify the login page is displayed")
    public void the_user_clicks_the_sign_button_and_verify_the_login_page_is_displayed() {
        new FirstPage().signBtn.click();
        Assert.assertTrue(Driver.get().getTitle().contains("Log in"));
        BrowserUtils.waitFor(2);
    }

    @Then("the user puts invalid credentials on login page")
    public void the_user_puts_invalid_credentials_on_login_page(Map<String,String> credentials) {
        LoginPage loginPage=new LoginPage();

       for(int i=1; i<=credentials.size()/2; i++) {

           loginPage.nameInput.sendKeys(credentials.get("username"+i));//get(username1)=asdf
           loginPage.passwordInput.sendKeys(credentials.get("password"+i));//get(password1)=asdf
           loginPage.submitBtn.click();
           String expectedMessage = "Login and/or password are wrong.";
           verify_Login_and_or_password_are_wrong_message_is_displayed();
           //Assert.assertEquals(expectedMessage, actualMessage);

           BrowserUtils.waitFor(1);

       }

    }



    @And("verify Login and or password are wrong message is displayed")
    public void verify_Login_and_or_password_are_wrong_message_is_displayed() {
        WebElement alert = Driver.get().findElement(By.cssSelector(".alert.alert-error"));
        Assert.assertTrue(alert.getText().contains("wrong"));
    }

}
