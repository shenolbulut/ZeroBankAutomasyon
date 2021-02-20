package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class PayBillsDef {
    @Then("the user is on the {string} tab")
    public void the_user_is_on_the_tab(String tab) {
        new PayBillsPage().payBillTabs(tab);
    }

    @Then("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> info) throws InterruptedException {

           for (String key : info.keySet()) {
               new PayBillsPage().inputs(key, info.get(key));
           }
           BrowserUtils.waitFor(1);

        new PayBillsPage().addBttn.click();
    }

    @Then("message The new payee The Law Office of Hyde, Price & Scharks was succesfully created should be displayed")
    public void message_The_new_payee_The_Law_Office_of_Hyde_Price_Scharks_was_succesfully_created_should_be_displayed() {
        String message="The new payee The Law Office of Hyde, Price & Scharks was successfully created.";
        Assert.assertEquals(message, new PayBillsPage().message.getText());
    }

}
