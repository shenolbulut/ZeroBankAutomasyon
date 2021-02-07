package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class PayBillsDef {
    @Then("verify the Pay Bill page is displayed")
    public void verify_the_Pay_Bill_page_is_displayed() {
        String expectedTitle="Zero - Pay Bills";
        Assert.assertEquals(expectedTitle, Driver.get().getTitle());
    }

    @Then("input the money on amount button")
    public void input_the_money_on_amount_button() {
       new PayBillsPage().amountButton.sendKeys(String.valueOf(1000));
    }

    @Then("input the date on the date button")
    public void input_the_date_on_the_date_button() {
        new PayBillsPage().dateBtn.sendKeys("2021-02-07");
    }

    @Then("click the pay button")
    public void click_the_pay_button() {
        new PayBillsPage().payBtn.click();
        BrowserUtils.waitFor(1);
    }

    @Then("verify The payment was successfully submitted message is displayed")
    public void verify_The_payment_was_successfully_submitted_message_is_displayed() {
        String expectedMessage="The payment was successfully submitted.";
        System.out.println(new PayBillsPage().message.getText());
        Assert.assertEquals(expectedMessage, new PayBillsPage().message.getText());

    }

    @Then("verify lutfen bu alani doldurun message is displayed")
    public void verify_lutfen_bu_alani_doldurun_message_is_displayed() {
        String expectedMessage="Lütfen bu alanı doldurun.";

       Assert.assertEquals("true", new PayBillsPage().amountButton.getAttribute("required"));
    }
}
