package com.zerobank.step_definitions;

import com.zerobank.pages.PurchaseForeingCurrencyPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PurchaseFroreingCurrecyDef {
    Select select=new Select(new PurchaseForeingCurrencyPage().currencyDrpdwn);
    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> dataTable) {

        List<String> actualList= BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(dataTable,actualList);
    }
    @When("user tries to calculate cost without selecting currency")
    public void user_tries_to_calculate_cost_without_selecting_currency() {
        new PurchaseForeingCurrencyPage().calculateBtn.click();



    }

    @Then("error message displayed")
    public void error_message_displayed() {
        String expected="Please, ensure that you have filled all the required fields with valid values.";
        Alert alert= Driver.get().switchTo().alert();
        Assert.assertEquals(expected, alert.getText());
    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        select.selectByIndex(5);
        new PurchaseForeingCurrencyPage().calculateBtn.click();
    }

}
